package models;

import business.Credentials;
import enums.ECity;
import utils.Enums.RearrangeTypeEnum;
import utils.Enums.RelocateTypeEnum;
import utils.ListImageViewAbles;

public class City {

	private ListImageViewAbles<DiseaseCube> listCubes = new ListImageViewAbles<>();

	public City(ECity eCity) {

		this.listCubes.getListCredentials().coordinatesList = eCity.getCoordinates().clone();
		this.listCubes.getListCredentials().coordinatesList.addVector2(Credentials.INSTANCE.cMap);
		this.listCubes.getListCredentials().objectsPerRow = 3;
		this.listCubes.getListCredentials().relocateTypeEnum = RelocateTypeEnum.CENTER;
		this.listCubes.getListCredentials().rearrangeTypeEnum = RearrangeTypeEnum.PIVOT;

	}

	public ListImageViewAbles<DiseaseCube> getListCubes() {
		return this.listCubes;
	}

}
