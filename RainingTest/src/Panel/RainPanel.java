package Panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import model.Rain;



public class RainPanel extends JPanel {

	
	//this is what the timer will repaint 
	private class TimerHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();//calls the paintComponent method
		}
	}// end timer handler
	
	
	//for the animation
	private final int ANIMATION_DELAY = 20;
	Timer animationTimer = new Timer(ANIMATION_DELAY,new TimerHandler());
	

	//make an array with 50 rain
	Rain rainarray[] = new Rain[50];
	
	
	//constructor
	public RainPanel() {
		
		animationTimer.start();
	
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
	}

}
