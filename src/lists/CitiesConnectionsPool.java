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
		addCitiesConnectionCanBuildRailroadOffset(ECity.VIGO, ECity.OURENSE, 0, 8);
		addCitiesConnectionCanBuildRailroadOffset(ECity.VIGO, ECity.PORTO, 4, 0);
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
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VALLADOLID, ECity.SALAMANCA);
		addCitiesConnectionCanBuildRailroadOffset(ECity.PORTO, ECity.LISBOA, 15, 0);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ALBUFEIRA, ECity.LISBOA, 21, 0);
		addCitiesConnectionCanBuildRailroadOffset(ECity.ALBUFEIRA, ECity.HUELVA, 0, -10);
		addCitiesConnectionCanBuildRailroadNoOffset(ECity.VIGO, ECity.BRAGA);

	}

	private void addCitiesConnectionCanBuildRailroadNoOffset(ECity eCityA, ECity eCityB) {
		this.list.addLast(new CitiesConnection(eCityA, eCityB, true));
	}

	private void addCitiesConnectionCanBuildRailroadOffset(ECity eCityA, ECity eCityB,
			double offSetX, double offSetY) {
		this.list.addLast(new CitiesConnection(eCityA, eCityB, offSetX, offSetY, true));
	}

}
