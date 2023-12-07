package gameStates;

import business.InfectCity;
import gameStatesDefault.GameState;
import javafx.scene.input.KeyCode;
import lists.DeckInfection;

public class JUnit extends GameState {

	@Override
	public void execute() {

		DeckInfection.INSTANCE.getList().getArrayList().shuffle();

	}

	@Override
	protected void handleKeyPressed(KeyCode keyCode) {

		new InfectCity(3);

	}

}
