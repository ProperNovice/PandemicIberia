package lists;

import controller.Credentials;
import models.PurificationToken;
import utils.Enums.DirectionEnum;
import utils.Enums.RelocateTypeEnum;
import utils.ListCredentials;
import utils.ListImageViewAbles;

public enum PurificationTokensPile {

	INSTANCE;

	private ListImageViewAbles<PurificationToken> list = new ListImageViewAbles<>();

	private PurificationTokensPile() {

		ListCredentials listCredentials = this.list.getListCredentials();
		listCredentials.coordinatesList = Credentials.INSTANCE.cPurificationTokensPile;
		listCredentials.relocateTypeEnum = RelocateTypeEnum.BOTTOM_LEFT;
		listCredentials.directionEnumVertical = DirectionEnum.UP;
		listCredentials.objectsPerRow = 7;

	}

	public ListImageViewAbles<PurificationToken> getList() {
		return this.list;
	}

}
