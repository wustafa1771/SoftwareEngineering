/**************************************************************************
Developed by: Onur Berk Töre
Purpose: Player Class For Our Game

**************************************************************************/



package rushhour;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player {
	
	String name;
	
	
	int score;
	int health;
	int weaponType;
	int speed;
	int[] powerups;
	int height,width;
	
	private double xPlayer;	// x coordinate of player sprite
	private double yPlayer;	// y coordinate of player sprite
	
	private double xVelocity;
	private double yVelocity;
	
	
	private BufferedImage hero;

	public Player(double x, double y, Main game)
	{
		this.xPlayer = x;
		this.yPlayer = y;
		
		try
		{
			hero = ImageIO.read(getClass().getResource("/hero.png"));
		}
		catch (IOException e)
		{
			// Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * Everything that player needs to update
	 */
	public void update()
	{
		//smoother controls
		xPlayer += xVelocity;
		yPlayer += yVelocity;
		
	}
	
	/**
	 * Render graphics of player 
	 * @param g is the instance of graphics class that helps us draw graphics. g comes from the main game class
	 */
	public void render(Graphics g)
	{
		g.drawImage(hero, (int)xPlayer, (int)yPlayer, null);
		
		
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

	public double getxPlayer() {
		return xPlayer;
	}

	public void setxPlayer(double xPlayer) {
		this.xPlayer = xPlayer;
	}

	public double getyPlayer() {
		return yPlayer;
	}

	public void setyPlayer(double yPlayer) {
		this.yPlayer = yPlayer;
	}

	public double getxVelocity() {
		return xVelocity;
	}

	public void setxVelocity(double xVelocity) {
		this.xVelocity = xVelocity;
	}

	public double getyVelocity() {
		return yVelocity;
	}

	public void setyVelocity(double yVelocity) {
		this.yVelocity = yVelocity;
	}


	
}
