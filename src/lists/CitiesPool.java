package lists;

import enums.ECity;
import models.City;
import utils.ArrayList;
import utils.ShutDown;

public enum CitiesPool {

	INSTANCE;

	private ArrayList<CityToken> list = new ArrayList<>();

	private CitiesPool() {

		for (ECity eCity : ECity.values())
			this.list.addLast(new CityToken(eCity, new City(eCity)));

	}

	public City getCity(ECity eCity) {

		for (CityToken cityToken : this.list)
			if (eCity.equals(cityToken.eCity))
				return cityToken.city;

		ShutDown.INSTANCE.execute();
		return null;

	}

	private class CityToken {

		public ECity eCity = null;
		public City city = null;

		public CityToken(ECity eCity, City city) {
			this.eCity = eCity;
			this.city = city;
		}

	}

}
