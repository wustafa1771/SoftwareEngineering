/**************************************************************************
Developed by: Onur Berk Tore
Purpose: Seagull Class For Our Game

**************************************************************************/

package RushHour;

public class Seagull {

	int ID;
	
	int health;
	int speed;
	int movementType;
	
	int height,width;
	
	Seagull(int ID,int health, int speed,int height,int width){
		
		this.ID = ID;
		this.health = health;
		this.speed  = speed;
		this.height = height;
		this.width = width;
		
		
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMovementType() {
		return movementType;
	}

	public void setMovementType(int movementType) {
		this.movementType = movementType;
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
