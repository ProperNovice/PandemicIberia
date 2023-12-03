package models;

import business.Credentials;
import enums.EColor;
import utils.ArrayList;
import utils.HashMap;
import utils.ListImageViewAbles;

public enum DiseaseCubesSupplyPiles {

	INSTANCE;

	public HashMap<EColor, ListImageViewAbles<DiseaseCube>> diseaseCubesSupplyPile = new HashMap<>();

	private DiseaseCubesSupplyPiles() {

		ArrayList<EColor> listEColors = new ArrayList<>(EColor.values());
		EColor eColor = null;
		ListImageViewAbles<DiseaseCube> list = null;

		// first

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiseaseCubeSupplyPileFirst;
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.diseaseCubesSupplyPile.put(eColor, list);

		// second

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiseaseCubeSupplyPileSecond;
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.diseaseCubesSupplyPile.put(eColor, list);

		// third

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiseaseCubeSupplyPileThird;
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.diseaseCubesSupplyPile.put(eColor, list);

		// fourth

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiseaseCubeSupplyPileFourth;
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.diseaseCubesSupplyPile.put(eColor, list);

	}

}
