package callofduty.domain.agents;

import java.util.ArrayList;
import java.util.List;

import callofduty.interfaces.Agent;
import callofduty.interfaces.Mission;

public abstract class BaseAgent implements Agent {
	private String id;
	private String name;
	private Double rating;
	private List <Mission> assignedMissions;
	private List<Mission> completedMissions;

	BaseAgent(String id, String name, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.assignedMissions = new ArrayList<>();
		this.completedMissions = new ArrayList<>();
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getRating() {
		return rating;
	}

	@Override
	public void acceptMission(Mission mission) {
		assignedMissions.add(mission);
	}

	@Override
	public void completeMissions() {
		completedMissions.addAll(assignedMissions);

		for (Mission mission : assignedMissions) {
			rating += mission.getRating();
			
			earnBounty(mission.getBounty());
		}
		
		assignedMissions.clear();
	}
	
	protected abstract void earnBounty(Double bounty);

}