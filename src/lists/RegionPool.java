package lists;

import enums.ECity;
import models.Region;
import utils.ArrayList;

public enum RegionPool {

	INSTANCE;

	private ArrayList<Region> list = new ArrayList<>();

	private RegionPool() {
		createRegions();
	}

	public ArrayList<Region> getList() {
		return this.list;
	}

	private void createRegions() {

		this.list.addLast(new Region(350, 269, ECity.A_CORUNA, ECity.GIJON, ECity.LEON,
				ECity.OURENSE, ECity.SANTIAGO_DE_COMPOSTELA));

		this.list.addLast(new Region(229, 343, ECity.VIGO, ECity.LEON, ECity.OURENSE,
				ECity.SANTIAGO_DE_COMPOSTELA));

		this.list.addLast(new Region(399, 424, ECity.VIGO, ECity.LEON, ECity.OURENSE,
				ECity.SALAMANCA, ECity.BRAGA));

		this.list.addLast(new Region(214, 476, ECity.VIGO, ECity.PORTO, ECity.BRAGA));

		this.list.addLast(new Region(351, 606, ECity.SALAMANCA, ECity.PORTO, ECity.BRAGA,
				ECity.COIMBRA, ECity.CACERES));

		this.list.addLast(new Region(160, 690, ECity.LISBOA, ECity.PORTO, ECity.COIMBRA));

		this.list.addLast(new Region(282, 815, ECity.LISBOA, ECity.EVORA, ECity.COIMBRA,
				ECity.CACERES, ECity.BADAJOZ));

		this.list.addLast(
				new Region(231, 1027, ECity.LISBOA, ECity.EVORA, ECity.ALBUFEIRA, ECity.HUELVA));

		this.list.addLast(new Region(416, 1004, ECity.BADAJOZ, ECity.EVORA, ECity.SEVILLA,
				ECity.HUELVA, ECity.CORDOBA));

		this.list.addLast(new Region(555, 932, ECity.BADAJOZ, ECity.CIUDAD_REAL, ECity.CORDOBA));

		this.list.addLast(new Region(546, 826, ECity.BADAJOZ, ECity.CIUDAD_REAL, ECity.CACERES,
				ECity.TOLEDO));

		this.list.addLast(
				new Region(574, 671, ECity.MADRID, ECity.SALAMANCA, ECity.CACERES, ECity.TOLEDO));

		this.list.addLast(new Region(614, 569, ECity.MADRID, ECity.SALAMANCA, ECity.VALLADOLID));

		this.list.addLast(new Region(583, 380, ECity.GIJON, ECity.SALAMANCA, ECity.VALLADOLID,
				ECity.LEON, ECity.SANTANDER));

		this.list.addLast(new Region(759, 293, ECity.BURGOS, ECity.VITORIA_GASTEIZ,
				ECity.VALLADOLID, ECity.BILBAO_BILBO, ECity.SANTANDER));

		this.list.addLast(new Region(893, 264, ECity.SAN_SEBASTIAN_DONOSTIA, ECity.VITORIA_GASTEIZ,
				ECity.PAMPLONA, ECity.BILBAO_BILBO));

		this.list.addLast(new Region(984, 378, ECity.HUESCA, ECity.VITORIA_GASTEIZ, ECity.PAMPLONA,
				ECity.ZARAGOZA));

		this.list.addLast(new Region(1264, 435, ECity.HUESCA, ECity.ANDORRA_LA_VELLA, ECity.GIRONA,
				ECity.ZARAGOZA, ECity.BARCELONA));

		this.list.addLast(new Region(1120, 549, ECity.TARRAGONA, ECity.TERUEL, ECity.ZARAGOZA,
				ECity.BARCELONA));

		this.list.addLast(new Region(870, 426, ECity.VITORIA_GASTEIZ, ECity.BURGOS, ECity.ZARAGOZA,
				ECity.SORIA));

		this.list.addLast(new Region(774, 552, ECity.VALLADOLID, ECity.BURGOS, ECity.ZARAGOZA,
				ECity.SORIA, ECity.MADRID));

		this.list.addLast(
				new Region(912, 623, ECity.CUENCA, ECity.TERUEL, ECity.ZARAGOZA, ECity.MADRID));

		this.list.addLast(new Region(690, 762, ECity.CUENCA, ECity.CIUDAD_REAL, ECity.ALBACETE,
				ECity.MADRID));

		this.list.addLast(new Region(827, 783, ECity.TOLEDO, ECity.CIUDAD_REAL, ECity.MADRID));

		this.list.addLast(
				new Region(773, 930, ECity.JAEN, ECity.CIUDAD_REAL, ECity.ALBACETE, ECity.CORDOBA));

		this.list.addLast(
				new Region(673, 1075, ECity.JAEN, ECity.GRANADA, ECity.MALAGA, ECity.CORDOBA));

		this.list.addLast(new Region(575, 1125, ECity.SEVILLA, ECity.MALAGA, ECity.CORDOBA));

		this.list.addLast(
				new Region(520, 1195, ECity.SEVILLA, ECity.MALAGA, ECity.GIBRALTAR, ECity.CADIZ));

		this.list.addLast(new Region(751, 1175, ECity.GRANADA, ECity.MALAGA, ECity.ALMERIA));

		this.list.addLast(new Region(875, 1030, ECity.GRANADA, ECity.JAEN, ECity.ALBACETE,
				ECity.CARTAGENA, ECity.ALMERIA));

		this.list.addLast(new Region(1031, 911, ECity.ALICANTE, ECity.VALENCIA, ECity.ALBACETE,
				ECity.CARTAGENA));

		this.list.addLast(new Region(981, 793, ECity.ALBACETE, ECity.VALENCIA, ECity.CUENCA));

		this.list.addLast(
				new Region(1120, 697, ECity.TERUEL, ECity.TARRAGONA, ECity.VALENCIA, ECity.CUENCA));

		this.list.addLast(new Region(1287, 672, ECity.BARCELONA, ECity.TARRAGONA, ECity.VALENCIA,
				ECity.PALMA_DE_MALLORCA));

	}

}
