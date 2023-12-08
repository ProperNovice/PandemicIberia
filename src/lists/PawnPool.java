package lists;

import enums.EColor;
import models.Pawn;
import utils.HashMap;

public enum PawnPool {

	INSTANCE;

	private HashMap<EColor, Pawn> hashMap = new HashMap<>();

	private PawnPool() {

		for (EColor eColor : EColor.values())
			this.hashMap.put(eColor, new Pawn(eColor));

	}

	public Pawn getPawn(EColor eColor) {
		return this.hashMap.getValue(eColor);
	}

}
