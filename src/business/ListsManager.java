package business;

import enums.EColor;
import listCredentials.DiseaseCubeSupplyPileFirst;
import listCredentials.DiseaseCubeSupplyPileFourth;
import listCredentials.DiseaseCubeSupplyPileSecond;
import listCredentials.DiseaseCubeSupplyPileThird;
import models.DiseaseCube;
import utils.ArrayList;
import utils.HashMap;
import utils.Interfaces.IImageViewAble;
import utils.ListImageViewAbles;

public enum ListsManager {

	INSTANCE;

	public final ArrayList<ListImageViewAbles<IImageViewAble>> lists = new ArrayList<ListImageViewAbles<IImageViewAble>>();
	public HashMap<EColor, ListImageViewAbles<DiseaseCube>> diseaseCubesSupplyPile = new HashMap<>();

	public void instantiate() {

		// disease cubes supply pile

		ArrayList<EColor> list = new ArrayList<>(EColor.values());

		this.diseaseCubesSupplyPile.put(list.removeRandom(),
				new ListImageViewAbles<>(DiseaseCubeSupplyPileFirst.class));
		this.diseaseCubesSupplyPile.put(list.removeRandom(),
				new ListImageViewAbles<>(DiseaseCubeSupplyPileSecond.class));
		this.diseaseCubesSupplyPile.put(list.removeRandom(),
				new ListImageViewAbles<>(DiseaseCubeSupplyPileThird.class));
		this.diseaseCubesSupplyPile.put(list.removeRandom(),
				new ListImageViewAbles<>(DiseaseCubeSupplyPileFourth.class));

	}

	public void saveListsOriginal() {

		for (ListImageViewAbles<IImageViewAble> list : this.lists)
			list.getArrayList().saveOriginal();

	}

	public void loadListsOriginal() {

		for (ListImageViewAbles<IImageViewAble> list : this.lists)
			list.getArrayList().clear();

		for (ListImageViewAbles<IImageViewAble> list : this.lists)
			list.getArrayList().loadOriginal();

	}

}
