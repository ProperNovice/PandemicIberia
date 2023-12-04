package models;

import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class RailroadToken implements IImageViewAble {

	public RailroadToken() {

		String fileName = "railroadToken.jpg";
		new ImageView(fileName, ELayerZ.RAILROAD_TOKENS, this);

		getImageView().setWidth(100);

	}

}
