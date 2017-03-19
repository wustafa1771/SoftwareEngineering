package rushhour;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter
{
	Main game;
	//Onur ' dan egemene soru
	//Classin adini main koymana izin veriyor mu ? 
	//Public void static main(String Args[] ) ile constructor birbirine giriyor diye biliyordum ben
	public KeyInput(Main game)
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
