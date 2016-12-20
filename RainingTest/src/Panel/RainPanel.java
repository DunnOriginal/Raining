package Panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import model.Rain;
import model.Splash;



public class RainPanel extends JPanel {

	
	
	
	//for the animation
	private final int ANIMATION_DELAY = 20;
	Timer animationTimer = new Timer(ANIMATION_DELAY,new TimerHandler());
	

	//make an array with 50 rain
	static Rain[] rainarray = new Rain[1];
	Rain test = new Rain(this);
	Splash test2 = new Splash();
	
		
	
	//constructor
	public RainPanel() {
		
		//http://stackoverflow.com/questions/15105097/java-object-array-java-lang-nullpointerexception
		/* This was needed it would keep spitting out null pointer exception*/
		//Instantiating the objects present in the array
		for(int i=0; i<  rainarray.length ; i++)
		{
		 rainarray[i] = new Rain(this);
		}
		
		
		
		this.setBackground(Color.WHITE);
		animationTimer.start();
	
	}
	
	
	//display the rain fall
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		//test.display(g, this);
		
		test.display(g, this);
//		if (test.endy > -3){
//			test2.display(g, this);
//		}	
		
//		for(int i=0; i < rainarray.length; i++)
//		{
//			rainarray[i].display(g, this);
//			
//			if (rainarray[i].endy > getHeight())
//			{
//				Splash splash = new Splash(rainarray[i]);
//				splash.splash(g,this);
//			}
//			 
//		
//			
//		}
		
		
	}//end paint comonent
	
	//this is what the timer will repaint 
		private class TimerHandler implements ActionListener
		{
			
			public void actionPerformed(ActionEvent e) {
				repaint();//calls the paintComponent method
				
			}
		}// end timer handler
		

}
