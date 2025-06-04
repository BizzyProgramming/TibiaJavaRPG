package bbrown2025;

public class Knight extends Character {
	
	private int regularAttack;
	private double knightHeal;
	private double addArmor;

	public Knight(String name, int level, String description, boolean isPromoted, double health) {
		super(name, level, description, isPromoted, health, "Knight");
	}
	
	public Knight(String name, int level, String description, boolean isPromoted, double health, String vocation) {
		super(name, level, description, isPromoted, health, vocation);
	}
	
	public void attack() {
		
	}
	
	@Override
	public String getFinalVocation() {
		return getIsPromoted() ? "Elite Knight" : "Knight";
	}
	
}
