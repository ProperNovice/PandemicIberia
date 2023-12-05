package lists;

import models.Region;
import utils.ArrayList;

public enum RegionPool {

	INSTANCE;

	private ArrayList<Region> list = new ArrayList<>();

	private RegionPool() {
		createRegions();
	}

	private void createRegions() {

	}

}
