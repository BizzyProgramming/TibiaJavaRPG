package bbrown2025;

public class Character {

	// Attributes and behavior in which all characters will have
	private String name;
	private int level;
	private String description;
	private boolean isPromoted;
	private double health;
	private String vocation;

	// Default constructor - creates an empty character
	public Character() {

	}

	// Constructor - initializes all character attributes
	public Character(String name, int level, String description, boolean isPromoted, double health, String vocation) {
		super();
		this.name = name;
		this.level = level;
		this.description = description;
		this.isPromoted = isPromoted;
		this.health = health;
		this.vocation = vocation;
	}

	// Getters & Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getIsPromoted() {
		return isPromoted;
	}

	public void setIsPromoted(boolean isPromoted) {
		this.isPromoted = isPromoted;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	// How to format and make the return nice and neat
	@Override
	public String toString() {
		return "Character Name: " + name + "\nHealth: " + health + "\nVocation: " + vocation + "\nLevel: " + level
				+ "\nDescription: " + description + "\n" + "Is Promoted: " + isPromoted + "\n";
	}

}
