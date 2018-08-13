package callofduty.domain.missions;

import callofduty.interfaces.Mission;

public abstract class BaseMission implements Mission {
	private String id;
	private Double rating;
	private Double bounty;

	BaseMission(String id, Double rating, Double bounty) {
		super();
		this.id = id;
		this.rating = rating;
		this.bounty = bounty;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public Double getRating() {
		return rating;
	}

	@Override
	public Double getBounty() {
		return bounty;
	}


}