package lists;

import enums.ERole;
import models.Role;
import utils.ArrayList;

public enum RolePool {

	INSTANCE;

	private ArrayList<Role> list = new ArrayList<>();

	private RolePool() {

		for (ERole eRole : ERole.values())
			this.list.addLast(new Role(eRole));

		this.list.saveOriginal();

	}

	public ArrayList<Role> getRandomRoles(int amount) {

		this.list.loadOriginal();

		for (Role role : this.list)
			role.getImageView().setVisible(false);

		ArrayList<Role> list = new ArrayList<>();

		while (amount > 0) {

			list.addLast(this.list.removeRandom());
			amount--;

		}

		for (Role role : list)
			role.getImageView().setVisible(true);

		return list;

	}

}
