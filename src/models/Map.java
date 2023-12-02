package models;

import business.Credentials;
import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public enum Map implements IImageViewAble {

	INSTANCE;

	private Map() {

		new ImageView("map.jpg", ELayerZ.MAP, this);
		getImageView().relocateTopLeft(Credentials.INSTANCE.cMap);

	}

}
