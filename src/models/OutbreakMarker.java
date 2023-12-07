package models;

import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class OutbreakMarker implements IImageViewAble {

	public OutbreakMarker() {
		new ImageView("outbreaksMarker.png", ELayerZ.MARKERS, this);
	}

}
