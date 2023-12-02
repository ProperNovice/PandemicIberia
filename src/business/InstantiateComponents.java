package business;

import enums.EColor;
import models.DiseaseCube;
import models.Map;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Map.values();
		diseaseCubes();

	}

	private void diseaseCubes() {

		for (int counter = 1; counter <= 12; counter++)
			for (EColor eColor : EColor.values())
				ListsManager.INSTANCE.diseaseCubesSupplyPile.getValue(eColor).getArrayList()
						.addLast(new DiseaseCube(eColor));

		for (EColor eColor : EColor.values())
			ListsManager.INSTANCE.diseaseCubesSupplyPile.getValue(eColor).relocateImageViews();

	}

}
