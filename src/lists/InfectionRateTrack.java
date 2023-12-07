package lists;

import controller.Credentials;
import models.InfectionRateToken;
import utils.ArrayList;
import utils.Vector2;

public enum InfectionRateTrack {

	INSTANCE;

	private InfectionRateToken infectionRateToken = new InfectionRateToken();
	private ArrayList<Position> list = new ArrayList<>();
	private int position = -1;

	private InfectionRateTrack() {

		double x = 1428 + Credentials.INSTANCE.cMap.x;
		double y = 315 + Credentials.INSTANCE.cMap.y;
		double xIncrement = 66;

		this.list.addLast(new Position(2, x, y));
		x += xIncrement;
		this.list.addLast(new Position(2, x, y));
		x += xIncrement;
		this.list.addLast(new Position(2, x, y));
		x += xIncrement;
		this.list.addLast(new Position(3, x, y));
		x += xIncrement;
		this.list.addLast(new Position(3, x, y));
		x += xIncrement;
		this.list.addLast(new Position(4, x, y));
		x += xIncrement;
		this.list.addLast(new Position(4, x, y));

		resetPosition();

	}

	public int getCurrentRate() {
		return this.list.get(position).rate;
	}

	public void proceedToNextPosition() {
		this.position++;
		relocateInfectionRateToken();
	}

	public void resetPosition() {
		this.position = 0;
		relocateInfectionRateToken();
	}

	private void relocateInfectionRateToken() {

		Position position = this.list.get(this.position);
		this.infectionRateToken.getImageView().relocateCenter(position.coordinates);

	}

	private class Position {

		public int rate = -1;
		public Vector2 coordinates = null;

		public Position(int rate, double x, double y) {

			this.rate = rate;
			this.coordinates = new Vector2(x, y);

		}

	}

}
