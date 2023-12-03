package lists;

import business.Credentials;
import enums.EColor;
import models.DiseaseCube;
import utils.ArrayList;
import utils.HashMap;
import utils.ListImageViewAbles;

public enum DiseaseCubesSupplyPiles {

	INSTANCE;

	private HashMap<EColor, ListImageViewAbles<DiseaseCube>> list = new HashMap<>();

	private DiseaseCubesSupplyPiles() {

		ArrayList<EColor> listEColors = new ArrayList<>(EColor.values());
		EColor eColor = null;
		ListImageViewAbles<DiseaseCube> list = null;

		// first

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiseaseCubeSupplyPileFirst;
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.list.put(eColor, list);

		// second

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiseaseCubeSupplyPileSecond;
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.list.put(eColor, list);

		// third

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiseaseCubeSupplyPileThird;
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.list.put(eColor, list);

		// fourth

		eColor = listEColors.removeRandom();
		list = new ListImageViewAbles<>();
		list.getListCredentials().coordinatesList = Credentials.INSTANCE.cDiseaseCubeSupplyPileFourth;
		list.getListCredentials().gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

		this.list.put(eColor, list);

	}
	
	public ListImageViewAbles<DiseaseCube> getList(EColor eColor){
		return this.list.getValue(eColor);
	}

}
