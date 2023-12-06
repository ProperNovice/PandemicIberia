package models;

import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class CardPlayer implements IImageViewAble {

	public CardPlayer() {

	}

	protected final void createCard() {

		new ImageView(getFilePath(), ELayerZ.CARDS, this);
		getImageView().setBack("cards/player/back.jpg");
		getImageView().flip();

	}

	protected abstract String getFilePath();

}
