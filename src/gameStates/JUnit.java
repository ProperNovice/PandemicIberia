package gameStates;

import business.Credentials;
import enums.ECity;
import gameStatesDefault.GameState;
import models.CardPlayerCity;

public class JUnit extends GameState {

	@Override
	public void execute() {

		new CardPlayerCity(ECity.CARTAGENA).getImageView()
				.relocateTopLeft(Credentials.INSTANCE.dMap.x + 10 + 4, 10);
		;

	}

}
