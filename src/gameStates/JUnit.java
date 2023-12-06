package gameStates;

import enums.ECity;
import enums.EColor;
import gameStatesDefault.GameState;
import lists.Cities;
import lists.CitiesConnectionsPool;
import lists.RegionPool;
import models.City;
import models.DiseaseCube;
import models.PurificationToken;
import models.Region;

public class JUnit extends GameState {

	@Override
	public void execute() {

		CitiesConnectionsPool.values();
		RegionPool.values();

		for (Region region : RegionPool.INSTANCE.getList())
			for (int counter = 1; counter <= 3; counter++) {
				region.getListPurificationWater().getArrayList().addLast(new PurificationToken());
				region.getListPurificationWater().relocateImageViews();
			}

		Region region = RegionPool.INSTANCE.getList().getLast();

		for (ECity eCity : region.getECities()) {

			EColor eColor = eCity.getEColor();
			City city = Cities.INSTANCE.getCity(eCity);
			city.getListCubes().getArrayList().addLast(new DiseaseCube(eColor));
			city.getListCubes().relocateImageViews();

		}

	}

}
