package models;

import controller.Credentials;
import enums.EColor;
import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class Pawn implements IImageViewAble {

	private EColor eColor = null;

	public Pawn(EColor eColor) {

		this.eColor = eColor;

		String filePath = "pawns/";
		filePath += this.eColor.toString().toLowerCase();
		filePath += ".png";
		new ImageView(filePath, ELayerZ.PAWNS, this);
		getImageView().setDimensions(Credentials.INSTANCE.dPawn);
		getImageView().setVisible(false);

	}

	public EColor getEColor() {
		return this.eColor;
	}

}
