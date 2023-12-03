package gameStates;

import enums.ECity;
import gameStatesDefault.GameState;
import lists.Cities;
import lists.DiseaseCubesSupplyPiles;
import models.City;

public class JUnit extends GameState {

	@Override
	public void execute() {

		for (ECity eCity : ECity.values()) {

			City city = Cities.INSTANCE.getCity(eCity);

			city.getListCubes().getArrayList().addLast(DiseaseCubesSupplyPiles.INSTANCE
					.getList(eCity.getEColor()).getArrayList().removeLast());

			if (eCity.isPort())
				city.getListCubes().getArrayList().addLast(DiseaseCubesSupplyPiles.INSTANCE
						.getList(eCity.getEColor()).getArrayList().removeLast());

			city.getListCubes().relocateImageViews();

		}

	}

}
