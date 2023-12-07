package lists;

import business.Credentials;
import models.OutbreakMarker;
import utils.HashMap;
import utils.Vector2;

public enum OutbreaksTrack {

	INSTANCE;

	private HashMap<Integer, Vector2> hashMap = new HashMap<>();
	private int currentOutbreaks = 0;
	private OutbreakMarker outbreakMarker = new OutbreakMarker();

	private OutbreaksTrack() {

		double x = 1736 + Credentials.INSTANCE.cMap.x;
		double y = 466 + Credentials.INSTANCE.cMap.x;
		double distantX = 74;
		double distantY = 57;
		int value = -1;

		// 0

		this.hashMap.put(++value, new Vector2(x, y + value * distantY));

		// 1

		this.hashMap.put(++value, new Vector2(x + distantX, y + value * distantY));

		// 2

		this.hashMap.put(++value, new Vector2(x, y + value * distantY));

		// 3

		this.hashMap.put(++value, new Vector2(x + distantX, y + value * distantY));

		// 4

		this.hashMap.put(++value, new Vector2(x, y + value * distantY));

		// 5

		this.hashMap.put(++value, new Vector2(x + distantX, y + value * distantY));

		// 6

		this.hashMap.put(++value, new Vector2(x, y + value * distantY));

		// 7

		this.hashMap.put(++value, new Vector2(x + distantX, y + value * distantY));

		// 8

		this.hashMap.put(++value, new Vector2(x, y + value * distantY));

		resetOutbreakMarker();

	}

	public void proceedToNextOutbreak() {

		this.currentOutbreaks++;
		relocateOutbreakMarker();

	}

	public boolean gameIsLost() {
		return this.currentOutbreaks == 8;
	}

	public void resetOutbreakMarker() {

		this.currentOutbreaks = 0;
		relocateOutbreakMarker();

	}

	private void relocateOutbreakMarker() {

		Vector2 vector2 = this.hashMap.getValue(this.currentOutbreaks);
		this.outbreakMarker.getImageView().relocateCenter(vector2);

	}

}
