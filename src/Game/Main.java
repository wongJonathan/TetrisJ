package Game;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main extends JFrame{

	public Main(){
		// Creates the panel for display
		add(new MainGameUpdate());
		
		// Sets the frame settings
		setSize(800,800);
		setTitle("My Tetris Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				Main main = new Main();
				main.setVisible(true);
				
			}
		});
	}
}
