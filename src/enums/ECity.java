package enums;

import utils.Vector2;

public enum ECity {

	INSTANCE(EColor.BLACK, false, 0, 0);

	private EColor eColor = null;
	private boolean isPort;
	private Vector2 coordinates = null;

	private ECity(EColor eColor, boolean isPort, double x, double y) {

		this.eColor = eColor;
		this.isPort = isPort;
		this.coordinates = new Vector2(x, y);

	}

	public EColor getEColor() {
		return this.eColor;
	}

	public boolean isPort() {
		return this.isPort;
	}

	public Vector2 getCoordinates() {
		return this.coordinates;
	}

}
