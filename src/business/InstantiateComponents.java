package business;

import enums.ECity;
import enums.EColor;
import lists.DeckInfection;
import lists.DiseaseCubesSupplyPiles;
import lists.Map;
import lists.PurificationTokensPile;
import lists.RailroadTokensPile;
import models.CardInfection;
import models.DiseaseCube;
import models.PurificationToken;
import models.RailroadToken;
import utils.Enums.ListsManager;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Map.values();
		diseaseCubes();
		cardInfection();
		railroadTokens();
		purufucationTokens();

		ListsManager.INSTANCE.saveListsOriginal();

	}

	private void purufucationTokens() {

		for (int counter = 1; counter <= 14; counter++)
			PurificationTokensPile.INSTANCE.getList().getArrayList()
					.addLast(new PurificationToken());

		PurificationTokensPile.INSTANCE.getList().relocateImageViews();

	}

	private void railroadTokens() {

		for (int counter = 1; counter <= 10; counter++)
			RailroadTokensPile.INSTANCE.getList().getArrayList().addFirst(new RailroadToken());

		RailroadTokensPile.INSTANCE.getList().relocateImageViews();

	}

	private void cardInfection() {

		for (ECity eCity : ECity.values())
			DeckInfection.INSTANCE.getList().getArrayList().addLast(new CardInfection(eCity));

		DeckInfection.INSTANCE.getList().relocateImageViews();

	}

	private void diseaseCubes() {

		for (int counter = 1; counter <= 24; counter++)
			for (EColor eColor : EColor.values())
				DiseaseCubesSupplyPiles.INSTANCE.getList(eColor).getArrayList()
						.addLast(new DiseaseCube(eColor));

		for (EColor eColor : EColor.values())
			DiseaseCubesSupplyPiles.INSTANCE.getList(eColor).relocateImageViews();

	}

}
