package controller;

import enums.ECity;
import enums.EColor;
import enums.EEvent;
import lists.CitiesConnectionsPool;
import lists.DeckCardPlayer;
import lists.DeckInfection;
import lists.DiseaseCubesPiles;
import lists.InfectionRateTrack;
import lists.Map;
import lists.OutbreaksTrack;
import lists.PawnPool;
import lists.PurificationTokensPile;
import lists.RailroadTokensPile;
import lists.RegionPool;
import models.CardInfection;
import models.CardPlayer;
import models.CardPlayerCity;
import models.CardPlayerEpidemic;
import models.CardPlayerEvent;
import models.DiseaseCube;
import models.PurificationToken;
import models.RailroadToken;
import utils.ArrayList;
import utils.Enums.ListsManager;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Map.values();
		CitiesConnectionsPool.values();
		RegionPool.values();
		OutbreaksTrack.values();
		InfectionRateTrack.values();
		PawnPool.values();

		diseaseCubes();
		cardInfection();
		railroadTokens();
		purifucationTokens();
		deckCardPlayer();

		ListsManager.INSTANCE.saveListsOriginal();

	}

	private void deckCardPlayer() {
		
		ArrayList<CardPlayer> list = DeckCardPlayer.INSTANCE.getList().getArrayList();

		for (ECity eCity : ECity.values())
			list.addLast(new CardPlayerCity(eCity));

		for (EEvent eEvent : EEvent.values())
			list.addLast(new CardPlayerEvent(eEvent));

		for (int counter = 1; counter <= 6; counter++)
			list.addLast(new CardPlayerEpidemic());

		DeckCardPlayer.INSTANCE.getList().relocateImageViews();

	}

	private void purifucationTokens() {

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
