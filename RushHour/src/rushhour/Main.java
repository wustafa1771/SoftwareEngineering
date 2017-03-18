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
		long lastTime = System.nanoTime();
		final double amountOfFrames = 60.0;
		double ns = 1000000000 / amountOfFrames;	// nanoseconds / 1.000.000.000 = seconds
		double delta = 0;	//time passed
		int updateCount = 0;
		int frames = 0;
		long timer = System.currentTimeMillis();
		
		while(running)
		{
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
				// (now - lastTime) is the elapsed time since the method was entered
				// elapsed time in seconds / 60.0.

			lastTime = now;
			
			// call delta after 1/60 seconds
			if(delta >= 1)
			{
				update();
				updateCount++;
				delta--;
			}
			render();
			frames++;
			
			// this is a timer
			// prints something every second
			if(System.currentTimeMillis() - timer > 1000)
			{
				timer += 1000;
				System.out.println( updateCount + " Updates FPS: " + frames );
				updateCount = 0;
				frames = 0;
				
			}
			
			
		}
		stop();
	}
	
	/**
	 * Everything that game updates
	 */
	private void update()
	{
		
		
	}

	/**
	 * Everything that game renders
	 */
	private void render()
	{
		
		
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
