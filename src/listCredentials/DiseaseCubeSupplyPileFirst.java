package listCredentials;

import business.Credentials;

public class DiseaseCubeSupplyPileFirst extends ListCredentials {

	public DiseaseCubeSupplyPileFirst() {

		super.coordinatesList = Credentials.INSTANCE.cDiseaseCubeSupplyPileFirst;
		super.gapBetweenComponents = Credentials.INSTANCE.dGapBetweenDiseaseCubes;

	}

}
