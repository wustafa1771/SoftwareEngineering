package rushhour;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter
{
	Main game;
	
	public KeyInput(Main game)
	{
		this.game = game;
		
	}
	
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		game.keyPressed(e);
		
	}
	
	@Override
	public void keyReleased(KeyEvent e)
	{
		game.keyReleased(e);
		
	}
	
}
