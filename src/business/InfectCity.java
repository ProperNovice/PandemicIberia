package business;

import enums.ECity;
import enums.EColor;
import lists.Cities;
import lists.DeckInfection;
import lists.DiscardPileInfection;
import lists.DiseaseCubesPiles;
import models.CardInfection;
import models.City;
import models.DiseaseCube;
import utils.ArrayList;
import utils.Lock;

public class InfectCity {

	public InfectCity(int value) {

		CardInfection cardInfection = DeckInfection.INSTANCE.getList().getArrayList().removeFirst();
		cardInfection.getImageView().setVisible(true);

		DiscardPileInfection.INSTANCE.getList().getArrayList().addFirst(cardInfection);
		DiscardPileInfection.INSTANCE.getList().animateSynchronous();

		ECity eCity = cardInfection.getECity();
		City city = Cities.INSTANCE.getCity(eCity);
		EColor eColor = eCity.getEColor();

		ArrayList<DiseaseCube> list = new ArrayList<>();

		for (int counter = 1; counter <= value; counter++) {

			DiseaseCube diseaseCube = DiseaseCubesPiles.INSTANCE.getList(eColor).getArrayList()
					.removeLast();

			list.addFirst(diseaseCube);

		}

		city.getListCubes().getArrayList().addAllLast(list);
		city.getListCubes().animateSynchronous();

		Lock.INSTANCE.lock();

	}

}
