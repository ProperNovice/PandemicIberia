package models;

import enums.ECity;

public class City {

	private ECity eCity = null;

	public City(ECity eCity) {

		this.eCity = eCity;

	}

	public ECity getECity() {
		return this.eCity;
	}

}
