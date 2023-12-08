package models;

import enums.EEvent;

public class CardPlayerEvent extends CardPlayer {

	private EEvent eEvent = null;

	public CardPlayerEvent(EEvent eEvent) {

		this.eEvent = eEvent;
		super.createCard();

	}

	@Override
	protected String getFilePath() {
		return "cards/player/event/" + this.eEvent + ".jpg";
	}

}
