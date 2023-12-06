package models;

import utils.Interfaces.IImageViewAble;

public abstract class CardPlayer implements IImageViewAble {

	public CardPlayer() {

	}

	protected abstract String getFileName();

}
