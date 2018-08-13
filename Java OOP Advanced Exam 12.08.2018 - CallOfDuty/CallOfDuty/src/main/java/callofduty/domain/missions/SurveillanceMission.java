package callofduty.domain.missions;

import callofduty.constants.Constant;

public class SurveillanceMission extends BaseMission {

	public SurveillanceMission(String id, Double rating, Double bounty) {
		super(id, rating * Constant.SURVEILLANCE_MISSION_DECREASE_GIVEN_RATING,
				bounty * Constant.SURVEILLANCE_MISSION_INCREASE_GIVEN_BONUS);
	}
}