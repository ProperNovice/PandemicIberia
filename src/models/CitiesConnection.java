package models;

import controller.Credentials;
import enums.ECity;
import utils.Vector2;

public class CitiesConnection {

	private ECity eCityA = null;
	private ECity eCityB = null;
	private Vector2 coordinates = null;
	private RailroadToken railroadToken = null;
	private boolean canBuildRailroad;

	public CitiesConnection(ECity eCityA, ECity eCityB, boolean canBuildRailroad) {
		this(eCityA, eCityB, 0, 0, canBuildRailroad);
	}

	public CitiesConnection(ECity eCityA, ECity eCityB, double offSetX, double offSetY,
			boolean canBuildRailroad) {

		this.eCityA = eCityA;
		this.eCityB = eCityB;
		this.canBuildRailroad = canBuildRailroad;

		double x = Credentials.INSTANCE.cMap.x;
		x += (this.eCityA.getCoordinates().x + this.eCityB.getCoordinates().x) / 2;
		x += offSetX;

		double y = Credentials.INSTANCE.cMap.y;
		y += (this.eCityA.getCoordinates().y + this.eCityB.getCoordinates().y) / 2;
		y += offSetY;

		this.coordinates = new Vector2(x, y);

	}

	public void addRailroadTokenRelocate(RailroadToken railroadToken) {

		this.railroadToken = railroadToken;
		this.railroadToken.getImageView().relocateCenter(this.coordinates);

	}

	public boolean canBuildRailroad() {
		return this.canBuildRailroad;
	}

}
