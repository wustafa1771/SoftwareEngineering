package rushhour;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main class for the game Rush Hour
 * @author egemen
 *
 */
public class Main extends JFrame implements Runnable
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = WIDTH / 16 * 9;
	private static final int SCALE = 3;
	
	private boolean running = false;
	private Thread thread;
	
	JPanel mainPanel;
	
	/**
	 * Starts the game
	 */
	private void start()
	{
		if(running)
			return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
		
	}
	
	/**
	 * Stops the game
	 */
	private void stop()
	{
		if(!running)
			return;
		
		running = false;
		try
		{
			thread.join();
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Game loop implementation
	 * 
	 */
	@Override
	public void run()
	{
		while(running)
		{
			
			System.out.println("Working");			
			
			
		}
		stop();	//maybe?
	}
	
	public static void main(String[] args)
	{
		Main game = new Main();
		game.setTitle("Rush Hour");
		game.mainPanel = new JPanel();
		game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));

		
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setResizable(false);
		game.setVisible(true);
		
		System.out.println("Hello World!");
		
		game.start();
		
	}



}
