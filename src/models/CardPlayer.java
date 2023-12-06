package models;

import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class CardPlayer implements IImageViewAble {

	protected final void createCard() {

		new ImageView(getFilePath(), ELayerZ.CARDS, this);
		getImageView().setVisible(false);

	}

	protected abstract String getFilePath();

}
