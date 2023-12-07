package lists;

import controller.Credentials;
import models.CardInfection;
import utils.Enums.LayerZListEnum;
import utils.Enums.RearrangeTypeEnum;
import utils.Enums.RelocateTypeEnum;
import utils.ListCredentials;
import utils.ListImageViewAbles;

public enum DeckInfection {

	INSTANCE;

	private ListImageViewAbles<CardInfection> list = new ListImageViewAbles<>();

	private DeckInfection() {

		ListCredentials listCredentials = this.list.getListCredentials();

		listCredentials.coordinatesList = Credentials.INSTANCE.cCardInfectionDeck;
		listCredentials.relocateTypeEnum = RelocateTypeEnum.CENTER;
		listCredentials.rearrangeTypeEnum = RearrangeTypeEnum.STATIC;
		listCredentials.layerZListEnum = LayerZListEnum.TO_FRONT_FIRST_IMAGEVIEW;

	}

	public ListImageViewAbles<CardInfection> getList() {
		return this.list;
	}

}
