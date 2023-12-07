package gameStates;

import gameStatesDefault.GameState;
import lists.DeckInfection;

public class JUnit extends GameState {

	@Override
	public void execute() {

		DeckInfection.INSTANCE.getList().getArrayList().shuffle();

		getFlow().addFirst(InfectStartingCities.class);
		proceedToNextGameState();

	}

}
