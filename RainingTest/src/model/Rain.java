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
	int startx;
	int starty;
	int endx ;
	int endy;
	int yspeed ; // speed how they fall
	
	
	public Rain(JPanel jp)
	{
		
		Random random = new Random();
		
		//System.out.println(jp.getWidth()+1);
		startx = random.nextInt(jp.getWidth()+1);
		starty = random.nextInt(jp.getHeight()+1);
		endx = startx;
		endy= random.nextInt(jp.getHeight()+1); ;
		yspeed = random.nextInt(20)+1; // speed how they fall
		
		
	}
	
	//http://stackoverflow.com/questions/11165055/drawline-using-double-variables-instead-of-integers
	/*I used this because graphics wasnt
	 * accepting my float types, so I found
	 * using Line2D can figure my problem*/
	Line2D line = new Line2D.Double();// didnt work with the overloading of Panel
	
	
	//this is how the rain will fall
	void fall(JPanel jp)
	{
	
		//If the Rain leaves the screen bring it back to top
		if (starty-20 > jp.getWidth())
		{
			//System.out.println(jp.getWidth()+1);
			startx = random.nextInt(jp.getWidth()+1);
			starty = -10;
			endx = startx;
			endy= starty + random.nextInt(30) ;
			yspeed = random.nextInt(20)+8; // speed how they fall
		}
		
		starty+=yspeed;
		endy += yspeed;
		
		
	}
	
	//make sure now to display
	public void display(Graphics g, JPanel jp)
	{
		fall(jp);
		
		line.setLine(startx, starty, endx, endy);
		g.setColor(Color.BLUE);
		g.drawLine(startx, starty, endx, endy);
		//g.draw(line);
		
		//g.drawLine(startx,starty, endx, endy);
		
	}
}
