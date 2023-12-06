package models;

import business.Credentials;
import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class CardPlayer implements IImageViewAble {

	public CardPlayer() {

	}

	protected final void createCard() {

		new ImageView(getFilePath(), ELayerZ.CARDS, this);
		getImageView().setDimensions(Credentials.INSTANCE.dCardPlayer);
		getImageView().setBack("cards/player/back.jpg");
		getImageView().flip();

	}

	protected abstract String getFilePath();

}
