package lists;

import controller.Credentials;
import models.CardPlayer;
import utils.Enums.LayerZListEnum;
import utils.Enums.RearrangeTypeEnum;
import utils.Enums.RelocateTypeEnum;
import utils.ListCredentials;
import utils.ListImageViewAbles;

public enum DeckCardPlayer {

	INSTANCE;

	private ListImageViewAbles<CardPlayer> list = new ListImageViewAbles<>();

	private DeckCardPlayer() {

		ListCredentials listCredentials = this.list.getListCredentials();

		listCredentials.coordinatesList = Credentials.INSTANCE.cCardPlayerDeck;
		listCredentials.relocateTypeEnum = RelocateTypeEnum.CENTER;
		listCredentials.rearrangeTypeEnum = RearrangeTypeEnum.STATIC;
		listCredentials.layerZListEnum = LayerZListEnum.TO_FRONT_FIRST_IMAGEVIEW;
		listCredentials.showListSize = true;

	}

	public ListImageViewAbles<CardPlayer> getList() {
		return this.list;
	}

}
