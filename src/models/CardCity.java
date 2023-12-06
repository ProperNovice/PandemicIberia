package models;

import enums.ECity;

public class CardCity extends CardPlayer {

	private ECity eCity = null;

	public CardCity(ECity eCity) {

		this.eCity = eCity;
		super.createCard();

	}

	public ECity getECity() {
		return this.eCity;
	}

	@Override
	protected String getFilePath() {
		return "cards/player/city/" + this.eCity + ".jpg";
	}

}
