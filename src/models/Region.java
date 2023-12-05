package models;

import enums.ECity;
import utils.ArrayList;
import utils.ListImageViewAbles;

public class Region {

	private ArrayList<ECity> listECities = new ArrayList<>();
	private ListImageViewAbles<PurificationToken> listPurufucationWater = new ListImageViewAbles<>();

	public Region(double x, double y, ECity... cities) {

		this.listECities.addAllLast(cities);

		// purification water list

	}

	public ArrayList<ECity> getECities() {
		return this.listECities;
	}

}
