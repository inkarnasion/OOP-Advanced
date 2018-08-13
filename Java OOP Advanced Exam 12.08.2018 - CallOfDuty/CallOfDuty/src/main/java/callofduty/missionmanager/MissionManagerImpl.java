package callofduty.missionmanager;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import callofduty.constants.Constant;
import callofduty.domain.agents.BaseAgent;
import callofduty.domain.agents.MasterAgent;
import callofduty.domain.agents.NoviceAgent;
import callofduty.interfaces.Agent;
import callofduty.interfaces.Mission;
import callofduty.interfaces.MissionControl;
import callofduty.interfaces.MissionManager;

public class MissionManagerImpl implements MissionManager {
    private MissionControl missionControl;
    private List<Agent> agents;
    private List<Mission> missions;

    public MissionManagerImpl(MissionControl missionControl) {
        super();
        this.missionControl = missionControl;
        this.agents = new ArrayList<>();
        this.missions = new ArrayList<>();
    }

    @Override
    public String agent(List<String> arguments) {
        String result;
        String id = arguments.get(1);
        String name = arguments.get(2);

        Agent agent = new NoviceAgent(id, name);
        agents.add(agent);

        result = String.format(Constant.REGISTERED_AGENT_PRINTING,
                agent.getName(), agent.getId());

        return result;
    }

    @Override
    public String request(List<String> arguments) {
        String result;
        String agentId = arguments.get(1);
        String missionId = arguments.get(2);
        Double missionRating = Double.valueOf(arguments.get(3));
        Double missionBounty = Double.valueOf(arguments.get(4));
        Agent agent;

        Mission mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        missions.add(mission);

        agent = findAgent(agentId);
        agent.acceptMission(mission);

        result = String.format(Constant.FINAL_ASSIGNED_AGENT_PRINTING,
                mission.getClass().getSimpleName()
                        .replace("Mission", " Mission"),
                mission.getId(), agent.getName());

        return result;
    }

    @Override
    public String complete(List<String> arguments) {
        String result;
        String agentId = arguments.get(1);
        Agent agent;

        agent = findAgent(agentId);

        agent.completeMissions();
        List<Mission> completedMissions = getAgentMissions(agent, "completedMissions");
        int completedMissionsCount = completedMissions.size();

        if (completedMissionsCount >= 3 && agent instanceof NoviceAgent) {
            Agent masterAgent = new MasterAgent(agent.getId(), agent.getName(), agent.getRating());
            setAgentMissions(masterAgent, "completedMissions", completedMissions);

            agents.remove(agent);
            agents.add(masterAgent);
        }

        result = String.format(Constant.COMPLETE_FINAL_ASSIGNED_MISSION_PRINTING,
                agent.getName(), agent.getId());
        return result;
    }

    @Override
    public String status(List<String> arguments) {
        String result;
        String id = arguments.get(1);
        Agent agent;
        Mission mission;
        String missionStatus;

        agent = findAgent(id);

        if (agent != null) {
            if (agent instanceof MasterAgent) {
                result = String.format(Constant.MASTER_AGENT_INITIAL, agent.getName(), agent.getId(),
                        getAgentMissions(agent, "assignedMissions").size(),
                        getAgentMissions(agent, "completedMissions").size(),
                        agent.getRating(), ((MasterAgent) agent).getBounty());
            } else {
                result = String.format(Constant.NOVICE_AGENT_INITIAL, agent.getName(), agent.getId(),
                        getAgentMissions(agent, "assignedMissions").size(),
                        getAgentMissions(agent, "completedMissions").size(),
                        agent.getRating());
            }
        } else {
            mission = findMission(id);

            missionStatus = isMissionOpenned(mission) ? "Open" : "Completed";

            result = String.format(Constant.STATUS_RATING_BOUNTY_PRINTING,
                    mission.getClass().getSimpleName()
                            .replace("Mission", " Mission"),
                    mission.getId(), missionStatus,
                    mission.getRating(), mission.getBounty());
        }

        return result;
    }

    @Override
    public String over(List<String> arguments) {
        String result;
        int noviceAgentsCount = 0;
        int masterAgentsCount = 0;
        int assignedMissionsCount = 0;
        int completedMissionsCount = 0;
        double ratingEarned = 0D;
        double bountyEarned = 0D;

        for (Agent agent : agents) {
            if (agent instanceof MasterAgent) {
                masterAgentsCount++;
                bountyEarned += ((MasterAgent) agent).getBounty();
            } else {
                noviceAgentsCount++;
            }

            int assignedMissionsSize = getAgentMissions(agent, "assignedMissions").size();
            int completedMissionsSize = getAgentMissions(agent, "completedMissions").size();

            assignedMissionsCount += assignedMissionsSize;
            assignedMissionsCount += completedMissionsSize;

            completedMissionsCount += completedMissionsSize;

            ratingEarned += agent.getRating();
        }

        result = String.format(Constant.FINAL_NOVICE_AGENT_PRINTING,
                noviceAgentsCount, masterAgentsCount, assignedMissionsCount, completedMissionsCount, ratingEarned,
                bountyEarned);

        return result;
    }

    private Agent findAgent(String agentId) {
        Agent result = null;

        for (Agent agent : agents) {
            if (agentId.equals(agent.getId())) {
                result = agent;
                break;
            }
        }

        return result;
    }

    private Mission findMission(String missionId) {
        Mission result = null;

        for (Mission mission : missions) {
            if (missionId.equals(mission.getId())) {
                result = mission;
                break;
            }
        }

        return result;
    }

    private boolean isMissionOpenned(Mission mission) {
        boolean isOpenned = false;
        Agent agent;

        for (int i = 0; !isOpenned && i < agents.size(); i++) {
            agent = agents.get(i);

            List<Mission> assignedMissions = getAgentMissions(agent, "assignedMissions");

            for (int j = 0; !isOpenned && j < assignedMissions.size(); j++) {
                if (mission.equals(assignedMissions.get(j))) {
                    isOpenned = true;
                }
            }
        }

        return isOpenned;
    }

    private List<Mission> getAgentMissions(Agent agent, String missionType) {
        List<Mission> missions;

        try {
            Field field = BaseAgent.class.getDeclaredField(missionType);
            field.setAccessible(true);
            missions = (List<Mission>) field.get(agent);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
            missions = new ArrayList<>();
        }

        return missions;
    }

    private void setAgentMissions(Agent agent, String missionType, List<Mission> missions) {
        try {
            Field field = BaseAgent.class.getDeclaredField(missionType);
            field.setAccessible(true);
            field.set(agent, missions);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
            missions = new ArrayList<>();
        }
    }
}