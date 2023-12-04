package lists;

import business.Credentials;
import enums.EColor;
import models.DiseaseCube;
import utils.ArrayList;
import utils.HashMap;
import utils.ListImageViewAbles;
import utils.Vector2;

public enum DiseaseCubesSupplyPiles {

	INSTANCE;

	private HashMap<EColor, ListImageViewAbles<DiseaseCube>> list = new HashMap<>();

	private DiseaseCubesSupplyPiles() {

		ArrayList<EColor> listEColors = new ArrayList<>(EColor.values());
		EColor eColor = null;
		ListImageViewAbles<DiseaseCube> list = null;
		Vector2 coordinates = Credentials.INSTANCE.cDiseaseCubeSupplyPileFirst;

		// first

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = coordinates.clone();
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.list.put(eColor, list);

		// second

		coordinates.y += Credentials.INSTANCE.dGapBetweenDiseaseCubes.y;

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = coordinates.clone();
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.list.put(eColor, list);

		// third

		coordinates.y += Credentials.INSTANCE.dGapBetweenDiseaseCubes.y;

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = coordinates.clone();
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.list.put(eColor, list);

		// fourth

		coordinates.y += Credentials.INSTANCE.dGapBetweenDiseaseCubes.y;

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = coordinates.clone();
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.list.put(eColor, list);

	}

	public ListImageViewAbles<DiseaseCube> getList(EColor eColor) {
		return this.list.getValue(eColor);
	}

}
