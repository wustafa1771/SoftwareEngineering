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
	
	private int xPlayer;	// x coordinate of player sprite
	private int yPlayer;	// y coordinate of player sprite
	private BufferedImage hero;

	public Player(int x, int y, Main game)
	{
		this.xPlayer = x;
		this.yPlayer = y;
		
		try
		{
			hero = ImageIO.read(getClass().getResource("/hero.png"));
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void update()
	{
		
		
	}
	
	/**
	 * Render graphics of player 
	 * @param g is the instance of graphics class that helps us draw graphics. g comes from the main game class
	 */
	public void render(Graphics g)
	{
		g.drawImage(hero, xPlayer, yPlayer, null);
		
		
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
