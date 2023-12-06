package models;

import business.Credentials;
import enums.ECity;
import utils.ArrayList;
import utils.Enums.RearrangeTypeEnum;
import utils.ListCredentials;
import utils.ListImageViewAbles;
import utils.Vector2;

public class Region {

	private ArrayList<ECity> listECities = new ArrayList<>();
	private ListImageViewAbles<PurificationToken> listPurifucationWater = new ListImageViewAbles<>();

	public Region(double x, double y, ECity... cities) {

		this.listECities.addAllLast(cities);

		// purification water list

		ListCredentials listCredentials = this.listPurifucationWater.getListCredentials();
		listCredentials.coordinatesList = new Vector2(x, y);
		listCredentials.coordinatesList.addVector2(Credentials.INSTANCE.cMap);
		listCredentials.rearrangeTypeEnum = RearrangeTypeEnum.PIVOT;
		listCredentials.objectsPerRow = 3;

	}

	public ArrayList<ECity> getECities() {
		return this.listECities;
	}

	public ListImageViewAbles<PurificationToken> getListPurificationWater() {
		return this.listPurifucationWater;
	}

}
