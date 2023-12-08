package models;

import enums.ELayerZ;
import enums.ERole;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class Role implements IImageViewAble {

	private ERole eRole = null;

	public Role(ERole eRole) {

		this.eRole = eRole;

		String filePath = "cards/roles/";
		filePath += this.eRole;
		filePath += ".jpg";

		new ImageView(filePath, ELayerZ.ROLES, this);
		getImageView().setVisible(false);

	}

	public ERole getERole() {
		return this.eRole;
	}

}
