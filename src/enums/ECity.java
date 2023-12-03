package enums;

import utils.Vector2;

public enum ECity {

	A_CORUNA(EColor.BLUE, true, 189, 206), SANTIAGO_DE_COMPOSTELA(EColor.BLUE, false, 187, 284),
	VIGO(EColor.BLUE, true, 156, 390), OURENSE(EColor.BLUE, false, 352, 357),
	BRAGA(EColor.BLUE, false, 310, 481), SALAMANCA(EColor.BLUE, false, 508, 583),
	PORTO(EColor.BLUE, true, 172, 548), COIMBRA(EColor.BLUE, false, 275, 691),
	CACERES(EColor.BLUE, false, 428, 797), EVORA(EColor.BLUE, false, 258, 936),
	LISBOA(EColor.BLUE, true, 112, 904), ALBUFEIRA(EColor.BLUE, true, 208, 1142),;

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
