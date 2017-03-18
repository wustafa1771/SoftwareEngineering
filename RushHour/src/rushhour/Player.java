/**************************************************************************
Developed by: Onur Berk Töre
Purpose: Player Class For Our Game

**************************************************************************/



package rushhour;

public class Player {
	
	String name;
	
	
	int score;
	int health;
	int weaponType;
	int speed;
	int[] powerups;
	int height,width;
	
	private int xPlayer;
	private int yPlayer;

	public Player(int x, int y)
	{
		this.xPlayer = x;
		this.yPlayer = y;
		
		
	}

	public void update()
	{
		
		
	}
	
	public void render()
	{
		
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getWeaponType() {
		return weaponType;
	}


	public void setWeaponType(int weaponType) {
		this.weaponType = weaponType;
	}


	public int[] getPowerups() {
		return powerups;
	}


	public void setPowerups(int[] powerups) {
		this.powerups = powerups;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	
}
