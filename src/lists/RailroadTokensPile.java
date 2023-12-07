package lists;

import controller.Credentials;
import models.RailroadToken;
import utils.Enums.DirectionEnum;
import utils.Enums.RelocateTypeEnum;
import utils.ListCredentials;
import utils.ListImageViewAbles;

public enum RailroadTokensPile {

	INSTANCE;

	private ListImageViewAbles<RailroadToken> list = new ListImageViewAbles<>();

	private RailroadTokensPile() {

		ListCredentials listCredentials = this.list.getListCredentials();
		listCredentials.coordinatesList = Credentials.INSTANCE.cRailroadTokensPile;
		listCredentials.relocateTypeEnum = RelocateTypeEnum.BOTTOM_LEFT;
		listCredentials.directionEnumVertical = DirectionEnum.UP;
		listCredentials.objectsPerRow = 10;

	}

	public ListImageViewAbles<RailroadToken> getList() {
		return this.list;
	}

}
