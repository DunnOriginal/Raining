package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JPanel;

public class Rain {
	Random random= new Random();
	
	//int placex = random.nextInt(100)+50;
	//int speed = random.nextInt(20);
	/*How this program works is that 
	 * there is a you draw where you want
	 * the line to start and to end
	 * so the ends will be constant 
	 * fir now as i want all lines to
	 * be same sizes*/
	public int startx;
	public int starty;
	public int endx ;
	public int endy;
	public int yspeed ; // speed how they fall
	
	public boolean splash;
	
	
	
	Splash[] splasharray = new Splash[5];
	
	Splash splash1;
	
	
	
	
	
	
	
	public Rain(JPanel jp)
	{
		
		//Random random = new Random();
		
		
		
		
		
		//System.out.println(jp.getWidth()+1);
		startx = random.nextInt(jp.getWidth()+1);
		starty = random.nextInt(jp.getHeight()+1);
		endx = startx;
		endy= random.nextInt(jp.getHeight()+1); ;
		yspeed = random.nextInt(20)+1; // speed how they fall
		
		splash = false;
		
		
	}
	
	
	//this is how the rain will fall
	void fall(JPanel jp)
	{
	
		//If the Rain leaves the screen bring it back to top
		if (starty-20 > jp.getHeight())
		{
			//System.out.println(jp.getWidth()+1);
			startx = random.nextInt(jp.getWidth()+1);
			starty = -10;
			endx = startx;
			endy= starty + random.nextInt(30) ;
			yspeed = random.nextInt(20)+8; // speed how they fall
			//splash = false;
		}
		
//		if (endy > jp.getHeight())
//		{
//			splash = true;
//		}
		
		
		starty+=yspeed;
		endy += yspeed;
		
		
	}
	
	//make sure now to display
	public void display(Graphics g, JPanel jp)
	{
		fall(jp);
		
		
		g.setColor(Color.BLUE);
		g.drawLine(startx, starty, endx, endy);
		//g.draw(line);
		
		if (starty > jp.getHeight())
		{
			splash1 = new Splash(this);
		}
		
		if (splash1 != null)
		{
			splash1.display(g, jp);
		}
				
		
		//g.drawLine(startx,starty, endx, endy);
		
	}// end display
	
	
	
	// this is to Instantiate the classes in array
	private void instantSplashArray()
	{
		int amount = random.nextInt(5);
		for (Splash splash2 : splasharray)
		{
			splash2 = new Splash(this);
		}
	}// end method istantSplashArray
	
	 
	//here we are going to null all the classes
	private void nullSplasharay()
	{
		
	}
	
	
	
	
}//end Rin class
