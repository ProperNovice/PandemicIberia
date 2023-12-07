package business;

import enums.ECity;
import enums.EColor;
import lists.CitiesConnectionsPool;
import lists.DeckCardPlayer;
import lists.DeckInfection;
import lists.DiseaseCubesPiles;
import lists.InfectionRateTrack;
import lists.Map;
import lists.OutbreaksTrack;
import lists.PurificationTokensPile;
import lists.RailroadTokensPile;
import lists.RegionPool;
import models.CardInfection;
import models.CardPlayerCity;
import models.DiseaseCube;
import models.PurificationToken;
import models.RailroadToken;
import utils.Enums.ListsManager;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Map.values();
		CitiesConnectionsPool.values();
		RegionPool.values();
		OutbreaksTrack.values();
		InfectionRateTrack.values();

		diseaseCubes();
		cardInfection();
		railroadTokens();
		purufucationTokens();
		deckCardPlayer();

		ListsManager.INSTANCE.saveListsOriginal();

	}

	private void deckCardPlayer() {

		for (ECity eCity : ECity.values())
			DeckCardPlayer.INSTANCE.getList().getArrayList().addLast(new CardPlayerCity(eCity));

		DeckCardPlayer.INSTANCE.getList().relocateImageViews();

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
				DiseaseCubesPiles.INSTANCE.getList(eColor).getArrayList()
						.addLast(new DiseaseCube(eColor));

		for (EColor eColor : EColor.values())
			DiseaseCubesPiles.INSTANCE.getList(eColor).relocateImageViews();

	}

}
