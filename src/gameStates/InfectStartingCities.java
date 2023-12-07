package gameStates;

import business.InfectCity;
import enums.EText;
import gameStatesDefault.GameState;

public class InfectStartingCities extends GameState {

	@Override
	public void execute() {

		EText.INFECT_STARTING_CITIES.show();
		EText.CONTINUE.show();

	}

	@Override
	protected void executeTextOption(EText eText) {

		for (int cubes = 3; cubes >= 1; cubes--)
			for (int cities = 1; cities <= 3; cities++)
				new InfectCity(cubes);

		proceedToNextGameState();

	}

}
