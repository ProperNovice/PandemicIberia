package lists;

import enums.ECity;
import models.CitiesConnection;
import utils.ArrayList;

public enum CitiesConnectionsPool {

	INSTANCE;

	private ArrayList<CitiesConnection> list = new ArrayList<>();

	private CitiesConnectionsPool() {
		createConnections();
	}

	private void createConnections() {

		addCitiesConnectionCanBuildRailroadNoOffset(ECity.A_CORUNA, ECity.SANTIAGO_DE_COMPOSTELA,
				true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VIGO, ECity.SANTIAGO_DE_COMPOSTELA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.OURENSE, ECity.SANTIAGO_DE_COMPOSTELA,
				true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.PORTO, ECity.BRAGA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.PORTO, ECity.COIMBRA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.LISBOA, ECity.COIMBRA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CACERES, ECity.COIMBRA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.LISBOA, ECity.EVORA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.BADAJOZ, ECity.EVORA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUELVA, ECity.EVORA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUELVA, ECity.SEVILLA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CADIZ, ECity.SEVILLA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CORDOBA, ECity.SEVILLA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CORDOBA, ECity.BADAJOZ, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CIUDAD_REAL, ECity.BADAJOZ, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CACERES, ECity.BADAJOZ, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CACERES, ECity.TOLEDO, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CACERES, ECity.SALAMANCA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.BRAGA, ECity.SALAMANCA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.LEON, ECity.SALAMANCA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.LEON, ECity.OURENSE, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.GIJON, ECity.LEON, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.GIJON, ECity.A_CORUNA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.MADRID, ECity.SALAMANCA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.MADRID, ECity.TOLEDO, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CIUDAD_REAL, ECity.TOLEDO, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CIUDAD_REAL, ECity.ALBACETE, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.JAEN, ECity.ALBACETE, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.JAEN, ECity.CORDOBA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.JAEN, ECity.GRANADA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.MALAGA, ECity.GRANADA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.ALMERIA, ECity.GRANADA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.ALMERIA, ECity.MALAGA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALLADOLID, ECity.SALAMANCA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALLADOLID, ECity.SANTANDER, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALLADOLID, ECity.BURGOS, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALLADOLID, ECity.MADRID, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.ZARAGOZA, ECity.MADRID, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CUENCA, ECity.MADRID, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VIGO, ECity.BRAGA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CADIZ, ECity.GIBRALTAR, false);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VITORIA_GASTEIZ, ECity.BURGOS, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SORIA, ECity.BURGOS, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SORIA, ECity.ZARAGOZA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VITORIA_GASTEIZ, ECity.BILBAO_BILBO,
				true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SANTANDER, ECity.BILBAO_BILBO, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SAN_SEBASTIAN_DONOSTIA,
				ECity.BILBAO_BILBO, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SAN_SEBASTIAN_DONOSTIA, ECity.PAMPLONA,
				true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUESCA, ECity.PAMPLONA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUESCA, ECity.ZARAGOZA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUESCA, ECity.ANDORRA_LA_VELLA, false);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VITORIA_GASTEIZ, ECity.PAMPLONA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VITORIA_GASTEIZ, ECity.ZARAGOZA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.TERUEL, ECity.ZARAGOZA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.TERUEL, ECity.CUENCA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.TERUEL, ECity.TARRAGONA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.ALBACETE, ECity.CUENCA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALENCIA, ECity.CUENCA, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALENCIA, ECity.ALBACETE, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALENCIA, ECity.ALICANTE, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CARTAGENA, ECity.ALBACETE, true);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.BARCELONA, ECity.PALMA_DE_MALLORCA,
				false);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.BARCELONA, ECity.ZARAGOZA, true);

		addCitiesConnectionCanBuildRailroadOffset(ECity.VALENCIA, ECity.PALMA_DE_MALLORCA, 0, -10,
				false);
		addCitiesConnectionCanBuildRailroadOffset(ECity.BARCELONA, ECity.GIRONA, -10, -10, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ANDORRA_LA_VELLA, ECity.GIRONA, 0, 20,
				false);
		addCitiesConnectionCanBuildRailroadOffset(ECity.BARCELONA, ECity.TARRAGONA, 0, -10, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.VALENCIA, ECity.TARRAGONA, -20, 0, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.CARTAGENA, ECity.ALICANTE, -10, 0, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.MADRID, ECity.CIUDAD_REAL, 30, 0, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.GIJON, ECity.SANTANDER, -10, 30, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.PORTO, ECity.LISBOA, 15, 0, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ALBUFEIRA, ECity.LISBOA, 21, 0, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ALBUFEIRA, ECity.HUELVA, 0, -10, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.SEVILLA, ECity.MALAGA, 0, 8, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.GIBRALTAR, ECity.MALAGA, -15, -15, false);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ALMERIA, ECity.CARTAGENA, -24, -24, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.VIGO, ECity.OURENSE, 0, 8, true);
		addCitiesConnectionCanBuildRailroadOffset(ECity.VIGO, ECity.PORTO, 4, 0, true);

	}

	private void addCitiesConnectionCanBuildRailroadNoOffset(ECity eCityA, ECity eCityB,
			boolean canBuildRailroad) {
		this.list.addLast(new CitiesConnection(eCityA, eCityB, canBuildRailroad));
	}

	private void addCitiesConnectionCanBuildRailroadOffset(ECity eCityA, ECity eCityB,
			double offSetX, double offSetY, boolean canBuildRailroad) {
		this.list.addLast(new CitiesConnection(eCityA, eCityB, offSetX, offSetY, canBuildRailroad));
	}

}
