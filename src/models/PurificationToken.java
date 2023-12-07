package models;

import controller.Credentials;
import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class PurificationToken implements IImageViewAble {

	public PurificationToken() {

		String fileName = "purificationToken.jpg";
		new ImageView(fileName, ELayerZ.PURIFICATION_TOKENS, this);
		getImageView().setDimensions(Credentials.INSTANCE.dPurificationToken);

	}

}
