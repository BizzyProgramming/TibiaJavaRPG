package bbrown2025;

public class Character {

	// Attributes in which my characters will have
	private String name;
	private int level;
	private String description;
	private boolean isPromoted;
	private double health;
	private String vocation;

	public Character() {

	}

	public Character(String name, int level, String description, boolean isPromoted, double health, String vocation) {
		super();
		this.name = name;
		this.level = level;
		this.description = description;
		this.isPromoted = isPromoted;
		this.health = health;
		this.vocation = vocation;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
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

	public boolean isPromoted() {
		return isPromoted;
	}

	public void setPromoted(boolean isPromoted) {
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

}
