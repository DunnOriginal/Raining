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
		startedy = rain.starty;
		x= rain.startx ;
		y= rain.starty;
		xspeed = rain.yspeed;
	}
	
	
	
	public void splash()
	{
		
		x+= xspeed;
		y-=5;
		
		if (y -10 <  startedy )
		{
			
			//xspeed = rand.nextInt(10)-5;
			//x =200;
			//y= 200;
			return;
		}
	
		
		
	}
	
	
	public void display(Graphics g, JPanel jp)
	{
		splash();
		
		g.setColor(Color.RED);
		g.drawLine(x+xspeed, y, x, y+3);
		
	}
	
	
}
