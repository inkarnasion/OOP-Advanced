package callofduty.domain.missions;

import callofduty.constants.Constant;

public class HuntMission extends BaseMission {

	public HuntMission(String id, Double rating, Double bounty)
	{
		super(id, rating* Constant.HUNT_MISSION_INCREASE_GIVEN_RATING,
                bounty*Constant.HUNT_MISSION_INCREASE_GIVEN_BONUS);
	}
}