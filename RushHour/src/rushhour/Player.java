/**************************************************************************
Developed by: Onur Berk Tore
Purpose: Player Class For Our Game

**************************************************************************/

package RushHour;


public class Player {
	
	String name;
	
	
	int score;
	int health;
	WeaponType weaponType;
	int bulletCounter;
	int simitCounter;
	int speed;
	int level;
	powerUps[] powerups;
	
	int height,width;
	
	WeaponType PlayerSapan = new sapan();
	
	Player(int height, int width){
		this.height = height;
		this.width = width;
		this.health = 100;
		this.simitCounter = 2;
		this.bulletCounter = 6;
		this.weaponType = PlayerSapan;
		this.speed = 1;
		this.level = 1;
		
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


	public WeaponType getWeaponType() {
		return weaponType;
	}


	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}


	public powerUps[] getPowerups() {
		return powerups;
	}


	public void setPowerups(powerUps[] powerups) {
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
	
	public void getDamage(int damage){
		
		this.health = health - damage;
	}
	
	public void getHealth(int health){
		
		this.health = health + health;
	}

	
}
