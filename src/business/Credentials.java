package business;

import utils.Enums.RearrangeTypeEnum;
import utils.Vector2;

public enum Credentials {

	INSTANCE;

	public String primaryStageTitle = "Pandemic: Iberia", numbersImageViewColor = "black";
	public boolean colliderVisibility = true;
	public double stagePixesOnTheLeft = 180 - 180, gapBetweenBorders = 10, textHeight = 50,
			selectEventHandlerAbleDimension = 100, imageViewCloneWidth = 200, animationStep = 4,
			cameraViewSpots = 1;
	public Vector2 dFrame, dGapBetweenComponents, dCameraView, dGapBetweenComponentsLineCast;
	public Vector2 cTextPanel, cImageViewClone;
	public RearrangeTypeEnum rearrangeTypeEnumText = RearrangeTypeEnum.LINEAR;

	public Vector2 dMap, dDiseaseCube, dGapBetweenDiseaseCubes, dRailroadToken, dPurificationToken;
	public Vector2 cMap, cDiseaseCubeSupplyPileFirst, cInfectionDeck, cInfectionDiscardPile,
			cRailroadTokensPile, cPurificationTokensPile;

	private Credentials() {

		double x = 0, y = 0;

		// frame

		this.dFrame = new Vector2(2560 - 4 - 636 + 636, 1368);

		// gaps

		this.dGapBetweenComponents = new Vector2(4, 4);
		this.dGapBetweenComponentsLineCast = this.dGapBetweenComponents;

		// camera view

		this.dCameraView = new Vector2(1, 1);

		// c text panel

		x = 0;
		x = 2000;
		y = 0;
		y = 50;

		this.cTextPanel = new Vector2(x, y);

		// c image view indicator

		x = this.gapBetweenBorders;
		y = this.gapBetweenBorders;
		this.cImageViewClone = new Vector2(x, y);

		// d map

		x = 1886;
		y = 1348;
		this.dMap = new Vector2(x, y);

		// c map

		x = this.gapBetweenBorders;
		y = this.gapBetweenBorders;
		this.cMap = new Vector2(x, y);

		// d disease cube

		x = 36;
		this.dDiseaseCube = new Vector2(x, x);

		// d disease cube supply pile gap

		x = this.dDiseaseCube.x + 1;
		y = this.dDiseaseCube.y + 1;
		this.dGapBetweenDiseaseCubes = new Vector2(x, y);

		// c disease cube supply pile first

		x = this.cMap.x;
		x += 190 - 190 + 2;
		y = this.cMap.y;
		y += 25 - 25 + 2;
		this.cDiseaseCubeSupplyPileFirst = new Vector2(x, y);

		// c infection deck

		x = this.cMap.x;
		x += 1373;
		y = this.cMap.y;
		y += 143;
		this.cInfectionDeck = new Vector2(x, y);

		// c infection discard pile

		x = this.cMap.x;
		x += 1706;
		y = this.cMap.y;
		y += 143;
		this.cInfectionDiscardPile = new Vector2(x, y);

		// c railroad tokens pile

		x = this.cMap.x + 2;
		y = this.dFrame.y;
		y -= this.gapBetweenBorders;
		y -= 2;
		this.cRailroadTokensPile = new Vector2(x, y);

		// d railroad token

		x = this.dDiseaseCube.x;
		x += 6;
		this.dRailroadToken = new Vector2(x, x);

		// d purification token

		x = this.dRailroadToken.x;
		this.dPurificationToken = new Vector2(x, x);

		// c purification tokens pile

		x = this.cRailroadTokensPile.x;
		y = this.cRailroadTokensPile.y;
		y -= this.dRailroadToken.y;
		y -= this.dGapBetweenComponents.y;
		this.cPurificationTokensPile = new Vector2(x, y);

	}

}
