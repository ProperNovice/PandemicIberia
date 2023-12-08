package models;

public class CardPlayerEpidemic extends CardPlayer {

	public CardPlayerEpidemic() {
		super.createCard();
	}

	@Override
	protected String getFilePath() {
		return "cards/player/epidemic.jpg";
	}

}
