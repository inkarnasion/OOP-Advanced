package callofduty.core;

import callofduty.interfaces.Mission;
import callofduty.interfaces.MissionControl;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;


public class MissionControlImplTest extends TestCase {
    private MissionControl missionControl;

    public MissionControlImplTest(String testName) {
        super(testName);
    }

    public static Test suite() {

        return new TestSuite(MissionControlImplTest.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        missionControl = new MissionControlImpl();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }


    public void testInBoundaries() {
        String missionId = "123";
        Double missionRating = 100D;
        Double missionBounty = 100D;
        Mission mission;

        // EscortMission - rating*0.75, bounty*1.25
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.EscortMission");
        assertEquals(missionId, mission.getId());
        assertEquals(missionRating * 0.75, mission.getRating());
        assertEquals(missionBounty * 1.25, mission.getBounty());

        // HuntMission - rating*1.5, bounty*2
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.HuntMission");
        assertEquals(missionId, mission.getId());
        assertEquals(missionRating * 1.5, mission.getRating());
        assertEquals(missionBounty * 2, mission.getBounty());

        // SurveillanceMission - rating * 0.25, bounty * 1.5
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.SurveillanceMission");
        assertEquals(missionId, mission.getId());
        assertEquals(missionRating * 0.25, mission.getRating());
        assertEquals(missionBounty * 1.5, mission.getBounty());

        // EscortMission - rating*0.75, bounty*1.25
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.EscortMission");
        assertEquals(missionId, mission.getId());
        assertEquals(missionRating * 0.75, mission.getRating());
        assertEquals(missionBounty * 1.25, mission.getBounty());
    }


    public void testUnderBoundaries() {
        String missionId = "12345678";
        Double missionRating = -100D;
        Double missionBounty = -100D;
        Mission mission;

        // EscortMission - rating*0.75, bounty*1.25
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.EscortMission");
        assertEquals(missionId, mission.getId());
        assertEquals(0D * 0.75, mission.getRating());
        assertEquals(0D * 1.25, mission.getBounty());

        // HuntMission - rating*1.5, bounty*2
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.HuntMission");
        assertEquals(missionId, mission.getId());
        assertEquals(0D * 1.5, mission.getRating());
        assertEquals(0D * 2, mission.getBounty());

        // SurveillanceMission - rating * 0.25, bounty * 1.5
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.SurveillanceMission");
        assertEquals(missionId, mission.getId());
        assertEquals(0D * 0.25, mission.getRating());
        assertEquals(0D * 1.5, mission.getBounty());

        // EscortMission - rating*0.75, bounty*1.25
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.EscortMission");
        assertEquals(missionId, mission.getId());
        assertEquals(0D * 0.75, mission.getRating());
        assertEquals(0D * 1.25, mission.getBounty());
    }


    public void testAboveBoundaries() {
        String missionId = "1234567890";
        Double missionRating = 1_000D;
        Double missionBounty = 1_000_000D;
        Mission mission;

        // EscortMission - rating*0.75, bounty*1.25
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.EscortMission");
        assertEquals(missionId.substring(0, 8), mission.getId());
        assertEquals(100D * 0.75, mission.getRating());
        assertEquals(100_000D * 1.25, mission.getBounty());

        // HuntMission - rating*1.5, bounty*2
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.HuntMission");
        assertEquals(missionId.substring(0, 8), mission.getId());
        assertEquals(100D * 1.5, mission.getRating());
        assertEquals(100_000D * 2, mission.getBounty());

        // SurveillanceMission - rating * 0.25, bounty * 1.5
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.SurveillanceMission");
        assertEquals(missionId.substring(0, 8), mission.getId());
        assertEquals(100D * 0.25, mission.getRating());
        assertEquals(100_000D * 1.5, mission.getBounty());

        // EscortMission - rating*0.75, bounty*1.25
        mission = missionControl.generateMission(missionId, missionRating, missionBounty);
        assertEquals(mission.getClass().getName(), "callofduty.domain.missions.EscortMission");
        assertEquals(missionId.substring(0, 8), mission.getId());
        assertEquals(100D * 0.75, mission.getRating());
        assertEquals(100_000D * 1.25, mission.getBounty());
    }
}
