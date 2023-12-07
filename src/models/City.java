package models;

import controller.Credentials;
import enums.ECity;
import utils.Enums.RearrangeTypeEnum;
import utils.Enums.RelocateTypeEnum;
import utils.Interfaces.ISelectCoordinatesAble;
import utils.ListImageViewAbles;
import utils.Vector2;

public class City implements ISelectCoordinatesAble {

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

	@Override
	public Vector2 getCoordinatesCenter() {
		return this.listDiseaseCubes.getListCredentials().coordinatesList;
	}

}
