package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Splash {

	Random rand = new Random();
	
	int xspeed = rand.nextInt(10)-5;
	
	
	int startedy;
	int x;
	int y;
	
	
	public Splash()
	{
		x =300;
		y= 300;
	}
	
	public Splash(Rain rain)
	{
		
		// TODO: Work on splashes
		
		
		//where the splash started and make it dispaper if it gets far away from start point
		startedy = rain.starty-20;
		x= rain.startx;
		y= rain.starty -20;
		
		// splash speed will depend on fall speed, but on goes in one way-- solve this
		xspeed = rain.yspeed;
	}
	
	
	
	public boolean splash()
	{
		
		x+= xspeed;
		y-=5;
		
		if (y  -15 > startedy )
		{
			
			//xspeed = rand.nextInt(10)-5;
			//x =200;
			//y= 200;
			return false;
		}
	
		
		return true;
	}
	
	
	public void display(Graphics g, JPanel jp)
	{
		
		g.setColor(Color.RED);
		g.drawLine(x+xspeed-2, y, x, y+3);
		
	}
	
	
}
