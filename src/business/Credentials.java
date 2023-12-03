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

	public Vector2 dMap, dDiseaseCube, dGapBetweenDiseaseCubes;
	public Vector2 cMap, cDiseaseCubeSupplyPileFirst, cDiseaseCubeSupplyPileSecond,
			cDiseaseCubeSupplyPileThird, cDiseaseCubeSupplyPileFourth;

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
		y = 0;

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
		this.cMap = new Vector2(x, x);

		// d disease cube

		x = 36 - 11;
		this.dDiseaseCube = new Vector2(x, x);

		// d disease cube supply pile gap

		x = this.dDiseaseCube.x + 1;
		y = this.dDiseaseCube.y + 1;
		this.dGapBetweenDiseaseCubes = new Vector2(x, y);

		// c disease cube supply pile first

		x = this.cMap.x;
		x += 190;
		y = this.cMap.y;
		y += 25;
		this.cDiseaseCubeSupplyPileFirst = new Vector2(x, y);

		// c disease cube supply pile second

		x = cDiseaseCubeSupplyPileFirst.x;
		y = cDiseaseCubeSupplyPileFirst.y;
		y += this.dGapBetweenDiseaseCubes.y;
		this.cDiseaseCubeSupplyPileSecond = new Vector2(x, y);

		// c disease cube supply pile third

		x = cDiseaseCubeSupplyPileSecond.x;
		y = cDiseaseCubeSupplyPileSecond.y;
		y += this.dGapBetweenDiseaseCubes.y;
		this.cDiseaseCubeSupplyPileThird = new Vector2(x, y);

		// c disease cube supply pile fourth

		x = cDiseaseCubeSupplyPileThird.x;
		y = cDiseaseCubeSupplyPileThird.y;
		y += this.dGapBetweenDiseaseCubes.y;
		this.cDiseaseCubeSupplyPileFourth = new Vector2(x, y);

	}

}
