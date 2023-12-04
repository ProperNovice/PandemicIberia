package business;

import enums.ECity;
import enums.EColor;
import lists.DeckInfection;
import lists.DiseaseCubesSupplyPiles;
import lists.Map;
import lists.RailroadTokensPile;
import models.CardInfection;
import models.DiseaseCube;
import models.RailroadToken;
import utils.Enums.ListsManager;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Map.values();
		diseaseCubes();
		cardInfection();
		railroadTokens();

		ListsManager.INSTANCE.saveListsOriginal();

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
