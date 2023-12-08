package enums;

public enum ERole {

	AGRONOMIST(EColor.GREEN), RAILWAYMAN(EColor.BLACK), POLITICIAN(EColor.YELLOW),
	ROYAL_ACADEMY_SCIENTIST(EColor.WHITE), NURSE(EColor.RED), RURAL_DOCTOR(EColor.PURPLE),
	SAILOR(EColor.BLUE);

	private EColor eColor = null;

	private ERole(EColor eColor) {
		this.eColor = eColor;
	}

	public EColor getEColor() {
		return this.eColor;
	}

}
