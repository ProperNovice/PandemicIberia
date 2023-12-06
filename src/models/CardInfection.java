package models;

import enums.ECity;
import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class CardInfection implements IImageViewAble {

	private ECity eCity = null;

	public CardInfection(ECity eCity) {

		this.eCity = eCity;

		String fileName = "cards/infection/";
		fileName += this.eCity;
		fileName += ".jpg";
		new ImageView(fileName, ELayerZ.CARDS, this);
		getImageView().setVisible(false);

	}

	public ECity getECity() {
		return this.eCity;
	}

}
