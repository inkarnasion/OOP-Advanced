package callofduty.domain.agents;

import callofduty.constants.Constant;

public class NoviceAgent extends BaseAgent {
    private double rating;

	public NoviceAgent(String id, String name) {
		super(id, name, Constant.NOVICE_AGENT_RATING_INITIALIZATION);
		this.rating=Constant.NOVICE_AGENT_RATING_INITIALIZATION;
	}


	@Override
protected void earnBounty(Double bounty) {

}
}