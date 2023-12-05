package lists;

import enums.ECity;
import models.CitiesConnection;
import models.RailroadToken;
import utils.ArrayList;

public enum CitiesConnectionsPool {

	INSTANCE;

	private ArrayList<CitiesConnection> list = new ArrayList<>();

	private CitiesConnectionsPool() {

		createConnections();

		for (CitiesConnection citiesConnection : this.list)
			citiesConnection.addRailroadTokenRelocate(new RailroadToken());

	}

	private void createConnections() {

		addCitiesConnectionCanBuildRailroadNoOffset(ECity.A_CORUNA, ECity.SANTIAGO_DE_COMPOSTELA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VIGO, ECity.SANTIAGO_DE_COMPOSTELA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.OURENSE, ECity.SANTIAGO_DE_COMPOSTELA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.PORTO, ECity.BRAGA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.PORTO, ECity.COIMBRA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.LISBOA, ECity.COIMBRA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CACERES, ECity.COIMBRA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.LISBOA, ECity.EVORA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.BADAJOZ, ECity.EVORA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUELVA, ECity.EVORA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUELVA, ECity.SEVILLA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CADIZ, ECity.SEVILLA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CORDOBA, ECity.SEVILLA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CORDOBA, ECity.BADAJOZ);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CIUDAD_REAL, ECity.BADAJOZ);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CACERES, ECity.BADAJOZ);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CACERES, ECity.TOLEDO);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CACERES, ECity.SALAMANCA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.BRAGA, ECity.SALAMANCA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.LEON, ECity.SALAMANCA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.LEON, ECity.OURENSE);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.GIJON, ECity.LEON);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.GIJON, ECity.A_CORUNA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.MADRID, ECity.SALAMANCA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.MADRID, ECity.TOLEDO);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CIUDAD_REAL, ECity.TOLEDO);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CIUDAD_REAL, ECity.ALBACETE);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.JAEN, ECity.ALBACETE);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.JAEN, ECity.CORDOBA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.JAEN, ECity.GRANADA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.MALAGA, ECity.GRANADA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.ALMERIA, ECity.GRANADA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.ALMERIA, ECity.MALAGA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALLADOLID, ECity.SALAMANCA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALLADOLID, ECity.SANTANDER);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALLADOLID, ECity.BURGOS);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALLADOLID, ECity.MADRID);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.ZARAGOZA, ECity.MADRID);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CUENCA, ECity.MADRID);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VIGO, ECity.BRAGA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CADIZ, ECity.GIBRALTAR);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VITORIA_GASTEIZ, ECity.BURGOS);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SORIA, ECity.BURGOS);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SORIA, ECity.ZARAGOZA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VITORIA_GASTEIZ, ECity.BILBAO_BILBO);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SANTANDER, ECity.BILBAO_BILBO);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SAN_SEBASTIAN_DONOSTIA,
				ECity.BILBAO_BILBO);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.SAN_SEBASTIAN_DONOSTIA, ECity.PAMPLONA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUESCA, ECity.PAMPLONA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUESCA, ECity.ZARAGOZA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.HUESCA, ECity.ANDORRA_LA_VELLA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VITORIA_GASTEIZ, ECity.PAMPLONA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VITORIA_GASTEIZ, ECity.ZARAGOZA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.TERUEL, ECity.ZARAGOZA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.TERUEL, ECity.CUENCA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.TERUEL, ECity.TARRAGONA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.ALBACETE, ECity.CUENCA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALENCIA, ECity.CUENCA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALENCIA, ECity.ALBACETE);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALENCIA, ECity.ALICANTE);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.CARTAGENA, ECity.ALBACETE);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.BARCELONA, ECity.PALMA_DE_MALLORCA);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.BARCELONA, ECity.ZARAGOZA);

		addCitiesConnectionCanBuildRailroadOffset(ECity.VALENCIA, ECity.PALMA_DE_MALLORCA, 0, -10);
		addCitiesConnectionCanBuildRailroadOffset(ECity.BARCELONA, ECity.GIRONA, -10, -10);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ANDORRA_LA_VELLA, ECity.GIRONA, 0, 20);
		addCitiesConnectionCanBuildRailroadOffset(ECity.BARCELONA, ECity.TARRAGONA, 0, -10);
		addCitiesConnectionCanBuildRailroadOffset(ECity.VALENCIA, ECity.TARRAGONA, -20, 0);
		addCitiesConnectionCanBuildRailroadOffset(ECity.CARTAGENA, ECity.ALICANTE, -10, 0);
		addCitiesConnectionCanBuildRailroadOffset(ECity.MADRID, ECity.CIUDAD_REAL, 30, 0);
		addCitiesConnectionCanBuildRailroadOffset(ECity.GIJON, ECity.SANTANDER, -10, 30);
		addCitiesConnectionCanBuildRailroadOffset(ECity.PORTO, ECity.LISBOA, 15, 0);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ALBUFEIRA, ECity.LISBOA, 21, 0);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ALBUFEIRA, ECity.HUELVA, 0, -10);
		addCitiesConnectionCanBuildRailroadOffset(ECity.SEVILLA, ECity.MALAGA, 0, 8);
		addCitiesConnectionCanBuildRailroadOffset(ECity.GIBRALTAR, ECity.MALAGA, -15, -15);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ALMERIA, ECity.CARTAGENA, -24, -24);
		addCitiesConnectionCanBuildRailroadOffset(ECity.VIGO, ECity.OURENSE, 0, 8);
		addCitiesConnectionCanBuildRailroadOffset(ECity.VIGO, ECity.PORTO, 4, 0);

	}

	private void addCitiesConnectionCanBuildRailroadNoOffset(ECity eCityA, ECity eCityB) {
		this.list.addLast(new CitiesConnection(eCityA, eCityB, true));
	}

	private void addCitiesConnectionCanBuildRailroadOffset(ECity eCityA, ECity eCityB,
			double offSetX, double offSetY) {
		this.list.addLast(new CitiesConnection(eCityA, eCityB, offSetX, offSetY, true));
	}

}
