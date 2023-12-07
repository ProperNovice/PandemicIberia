package models;

import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class InfectionRateToken implements IImageViewAble {

	public InfectionRateToken() {
		new ImageView("infectionRateToken.png", ELayerZ.MARKERS, this);
	}

}
