package bbrown2025;

public class Sorcerer extends Character {

	public Sorcerer(String name, int level, String description, boolean isPromoted, double health) {
		super(name, level, description, isPromoted, health, "Sorcerer");

	}

	public Sorcerer(String name, int level, String description, boolean isPromoted, double health, String vocation) {
		super(name, level, description, isPromoted, health, vocation);
	}

	Sorcerer() {

	}

	@Override
	public String getFinalVocation() {
		return getIsPromoted() ? "Master Sorcerer" : "Sorcerer";
	}

}
