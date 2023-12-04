package lists;

import models.RailroadToken;
import utils.ListImageViewAbles;

public enum RailroadTokensPile {

	INSTANCE;

	private ListImageViewAbles<RailroadToken> list = new ListImageViewAbles<>();

	private RailroadTokensPile() {

		
		
	}

	public ListImageViewAbles<RailroadToken> getList() {
		return this.list;
	}

}
