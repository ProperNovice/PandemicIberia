package gameStates;

import enums.ECity;
import gameStatesDefault.GameState;
import models.CardCity;

public class JUnit extends GameState {

	@Override
	public void execute() {
		
		System.out.println(new CardCity(ECity.CARTAGENA).getECity());

	}

}
