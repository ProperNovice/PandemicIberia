package lists;

import enums.ECity;
import models.City;
import utils.HashMap;

public enum Cities {

	INSTANCE;

	private HashMap<ECity, City> list = new HashMap<>();

	private Cities() {

		for (ECity eCity : ECity.values())
			this.list.put(eCity, new City(eCity));

	}

	public City getCity(ECity eCity) {
		return this.list.getValue(eCity);
	}

}
