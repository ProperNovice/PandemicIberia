package business;

import enums.EColor;
import lists.DiseaseCubesSupplyPiles;
import lists.Map;
import models.DiseaseCube;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Map.values();
		diseaseCubes();

	}

	private void diseaseCubes() {

		for (int counter = 1; counter <= 24; counter++)
			for (EColor eColor : EColor.values())
				DiseaseCubesSupplyPiles.INSTANCE.diseaseCubesSupplyPile.getValue(eColor)
						.getArrayList().addLast(new DiseaseCube(eColor));

		for (EColor eColor : EColor.values())
			DiseaseCubesSupplyPiles.INSTANCE.diseaseCubesSupplyPile.getValue(eColor)
					.relocateImageViews();

	}

}
