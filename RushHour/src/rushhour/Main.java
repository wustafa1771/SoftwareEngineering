package rushhour;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);	// buffered image for the whole window
	private Player player;
	
	JPanel mainPanel;
	
	/**
	 * Initializes the game here
	 */
	private void init()
	{

		addKeyListener(new KeyInput(this));
		
		player = new Player(200, 300, this);
		
		
		
	}
	
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
			// Auto-generated catch block
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
		init();
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
		player.update();
		
	}

	/**
	 * Everything that game renders
	 */
	private void render()
	{
		BufferStrategy bufferStrategy = this.getBufferStrategy();
		if(bufferStrategy == null)
		{
			createBufferStrategy(3);	// creates three frames back to back. (triple buffering)
			return;
		}
		Graphics g = bufferStrategy.getDrawGraphics();
		////image draw code start
		
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		player.render(g);
		
		////image draw code end
		g.dispose();
		bufferStrategy.show();
	}
	
	
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_RIGHT)
		{
			player.setxPlayer(player.getxPlayer() + 5);
		}
		else if(key == KeyEvent.VK_LEFT)
		{
			player.setxPlayer(player.getxPlayer() - 5);
		}
		else if(key == KeyEvent.VK_DOWN)
		{
			player.setyPlayer(player.getyPlayer() + 5);
		}
		else if(key == KeyEvent.VK_UP)
		{
			player.setyPlayer(player.getyPlayer() - 5);
		}

	}
	
	public void keyReleased(KeyEvent e)
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
