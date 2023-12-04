package models;

import business.Credentials;
import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class RailroadToken implements IImageViewAble {

	public RailroadToken() {

		String fileName = "railroadToken.png";
		new ImageView(fileName, ELayerZ.RAILROAD_TOKENS, this);

		getImageView().setDimensions(Credentials.INSTANCE.dRailroadToken);

	}

}
