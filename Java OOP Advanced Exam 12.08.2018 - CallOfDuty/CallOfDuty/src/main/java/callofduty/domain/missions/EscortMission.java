package callofduty.domain.missions;

import callofduty.constants.Constant;

public class EscortMission extends BaseMission {

	public EscortMission(String id, Double rating, Double bounty) {
		super(id, rating* Constant.ESCORT_MISSION_DECREASE_GIVEN_RATING,
				bounty*Constant.ESCORT_MISSION_INCREASE_GIVEN_BOUNTY);
	}
}
