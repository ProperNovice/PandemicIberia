package business;

import lists.DeckInfection;
import lists.DiscardPileInfection;
import models.CardInfection;
import utils.Lock;

public class InfectCity {

	public InfectCity(int value) {

		CardInfection cardInfection = DeckInfection.INSTANCE.getList().getArrayList().removeFirst();
		cardInfection.getImageView().setVisible(true);

		DiscardPileInfection.INSTANCE.getList().getArrayList().addFirst(cardInfection);
		DiscardPileInfection.INSTANCE.getList().animateSynchronous();

		Lock.INSTANCE.lock();

	}

}
