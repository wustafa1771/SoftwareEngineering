package rushhour;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter
{
	RushHour game;


	public KeyInput(RushHour game)
	{
		this.game = game;
		
	}
	
	/**
	 * Relays key press  event to the main game class
	 */
	@Override
	public void keyPressed(KeyEvent e)
	{
		game.keyPressed(e);
		
	}
	
	/**
	 * Relays key release event to the main game class
	 */
	@Override
	public void keyReleased(KeyEvent e)
	{
		game.keyReleased(e);
		
	}
	
}
