package enums;

import utils.Vector2;

public enum ECity {

	A_CORUNA(EColor.BLUE, true, 189, 206), SANTIAGO_DE_COMPOSTELA(EColor.BLUE, false, 187, 284),
	VIGO(EColor.BLUE, true, 156, 390), OURENSE(EColor.BLUE, false, 352, 357),
	BRAGA(EColor.BLUE, false, 310, 481), SALAMANCA(EColor.BLUE, false, 508, 583),
	PORTO(EColor.BLUE, true, 172, 548), COIMBRA(EColor.BLUE, false, 275, 691),
	CACERES(EColor.BLUE, false, 428, 797), EVORA(EColor.BLUE, false, 258, 936),
	LISBOA(EColor.BLUE, true, 112, 904), ALBUFEIRA(EColor.BLUE, true, 208, 1142),

	GIJON(EColor.RED, true, 515, 185), SANTANDER(EColor.RED, true, 720, 200),
	BILBAO_BILBO(EColor.RED, false, 825, 232), SAN_SEBASTIAN_DONOSTIA(EColor.RED, true, 951, 185),
	HUESCA(EColor.RED, false, 1109, 388), PAMPLONA(EColor.RED, false, 965, 301),
	VITORIA_GASTEIZ(EColor.RED, false, 860, 352), BURGOS(EColor.RED, false, 736, 379),
	SORIA(EColor.RED, false, 843, 490), MADRID(EColor.RED, false, 732, 658),
	VALLADOLID(EColor.RED, false, 617, 480), LEON(EColor.RED, false, 522, 334),

	ANDORRA_LA_VELLA(EColor.YELLOW, false, 1323, 343), GIRONA(EColor.YELLOW, false, 1470, 428),
	BARCELONA(EColor.YELLOW, true, 1399, 515), TARRAGONA(EColor.YELLOW, true, 1235, 564),
	PALMA_DE_MALLORCA(EColor.YELLOW, true, 1401, 776), VALENCIA(EColor.YELLOW, true, 1104, 795),
	ALICANTE(EColor.YELLOW, true, 1096, 957), CARTAGENA(EColor.YELLOW, true, 1035, 1071),
	ALBACETE(EColor.YELLOW, false, 941, 870), CUENCA(EColor.YELLOW, false, 911, 715),
	TERUEL(EColor.YELLOW, false, 1025, 673), ZARAGOZA(EColor.YELLOW, false, 1055, 477),

	TOLEDO(EColor.BLACK, false, 612, 736), BADAJOZ(EColor.BLACK, false, 363, 889),
	HUELVA(EColor.BLACK, true, 366, 1118), CADIZ(EColor.BLACK, true, 440, 1223),
	GIBRALTAR(EColor.BLACK, true, 536, 1276), MALAGA(EColor.BLACK, true, 646, 1196),
	ALMERIA(EColor.BLACK, true, 872, 1181), GRANADA(EColor.BLACK, false, 765, 1099),
	JAEN(EColor.BLACK, false, 742, 998), CIUDAD_REAL(EColor.BLACK, false, 704, 869),
	CORDOBA(EColor.BLACK, false, 607, 1028), SEVILLA(EColor.BLACK, false, 474, 1105);

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
