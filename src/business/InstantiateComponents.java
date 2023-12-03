package business;

import enums.EColor;
import lists.DiseaseCubesSupplyPiles;
import lists.Map;
import models.DiseaseCube;
import utils.Enums.ListsManager;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Map.values();
		diseaseCubes();

		ListsManager.INSTANCE.saveListsOriginal();

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
