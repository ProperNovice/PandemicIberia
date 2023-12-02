package models;

import business.Credentials;
import enums.EColor;
import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class DiseaseCube implements IImageViewAble {

	private EColor eColor = null;

	public DiseaseCube(EColor eColor) {

		this.eColor = eColor;

		String filePath = "diseaseCubes/";
		filePath += this.eColor.toString().toLowerCase();
		filePath += ".png";
		new ImageView(filePath, ELayerZ.DISEASE_CUBES, this);
		getImageView().setDimensions(Credentials.INSTANCE.dDiseaseCube);

	}

	public EColor getEColor() {
		return this.eColor;
	}

}
