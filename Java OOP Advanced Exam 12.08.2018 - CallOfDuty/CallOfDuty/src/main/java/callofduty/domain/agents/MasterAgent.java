package callofduty.domain.agents;

import callofduty.constants.Constant;
import callofduty.interfaces.BountyAgent;

public class MasterAgent extends BaseAgent implements BountyAgent {


	private Double bounty;


	public MasterAgent(String id, String name, Double rating) {
		super(id, name, rating);
		this.bounty = Constant.BOUNTY_START_VALUES;
	}


	@Override
	public Double getBounty() {
		return bounty;
	}



	@Override
	protected void earnBounty(Double bounty) {
		this.bounty += bounty;
	}
}