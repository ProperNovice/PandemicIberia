package models;

import business.Credentials;
import enums.ECity;
import utils.Enums.RearrangeTypeEnum;
import utils.Enums.RelocateTypeEnum;
import utils.ListImageViewAbles;

public class City {

	private ListImageViewAbles<DiseaseCube> listDiseaseCubes = new ListImageViewAbles<>();

	public City(ECity eCity) {

		// disease cubes

		this.listDiseaseCubes.getListCredentials().coordinatesList = eCity.getCoordinates().clone();
		this.listDiseaseCubes.getListCredentials().coordinatesList
				.addVector2(Credentials.INSTANCE.cMap);
		this.listDiseaseCubes.getListCredentials().objectsPerRow = 3;
		this.listDiseaseCubes.getListCredentials().relocateTypeEnum = RelocateTypeEnum.CENTER;
		this.listDiseaseCubes.getListCredentials().rearrangeTypeEnum = RearrangeTypeEnum.PIVOT;

	}

	public ListImageViewAbles<DiseaseCube> getListCubes() {
		return this.listDiseaseCubes;
	}

}
