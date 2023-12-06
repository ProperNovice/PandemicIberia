package models;

import business.Credentials;
import enums.ECity;
import utils.ArrayList;
import utils.Enums.RearrangeTypeEnum;
import utils.Interfaces.ISelectCoordinatesAble;
import utils.ListCredentials;
import utils.ListImageViewAbles;
import utils.Vector2;

public class Region implements ISelectCoordinatesAble {

	private ArrayList<ECity> listECities = new ArrayList<>();
	private ListImageViewAbles<PurificationToken> listPurifucationWater = new ListImageViewAbles<>();
	private Vector2 coordinates = null;

	public Region(double x, double y, ECity... cities) {

		this.coordinates = new Vector2(x, y);
		this.listECities.addAllLast(cities);

		// purification water list

		ListCredentials listCredentials = this.listPurifucationWater.getListCredentials();
		listCredentials.coordinatesList = this.coordinates;
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

	@Override
	public Vector2 getCoordinatesCenter() {
		return this.coordinates;
	}

}
