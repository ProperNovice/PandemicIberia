package lists;

import controller.Credentials;
import models.CardPlayer;
import utils.Enums.LayerZListEnum;
import utils.Enums.RearrangeTypeEnum;
import utils.Enums.RelocateTypeEnum;
import utils.ListCredentials;
import utils.ListImageViewAbles;

public enum DiscardPileCardPlayer {

	INSTANCE;

	private ListImageViewAbles<CardPlayer> list = new ListImageViewAbles<>();

	private DiscardPileCardPlayer() {

		ListCredentials listCredentials = this.list.getListCredentials();

		listCredentials.coordinatesList = Credentials.INSTANCE.cCardPlayerDiscardPile;
		listCredentials.relocateTypeEnum = RelocateTypeEnum.CENTER;
		listCredentials.rearrangeTypeEnum = RearrangeTypeEnum.STATIC;
		listCredentials.layerZListEnum = LayerZListEnum.TO_FRONT_FIRST_IMAGEVIEW;

	}

	public ListImageViewAbles<CardPlayer> getList() {
		return this.list;
	}

}
