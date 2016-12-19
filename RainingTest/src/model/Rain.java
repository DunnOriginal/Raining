package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class Rain {


	/*How this program works is that 
	 * there is a you draw where you want
	 * the line to start and to end
	 * so the ends will be constant 
	 * fir now as i want all lines to
	 * be same sizes*/
	float startx;
	float starty;
	float endx;
	float endy;
	float yspeed; // speed how they fall
	
	//http://stackoverflow.com/questions/11165055/drawline-using-double-variables-instead-of-integers
	/*I used this because graphics wasnt
	 * accepting my float types, so I found
	 * using Line2D can figure my problem*/
	Line2D line = new Line2D.Double();
	
	
	//this is how the rain will fall
	void fall( )
	{
		starty+=yspeed;
	}
	
	//make sure now to display
	void display(Graphics2D g, JPanel jp)
	{
		fall();
		
		line.setLine(startx, starty, endx, endy);
		g.setColor(Color.BLUE);
		g.draw(line);
		
		//g.drawLine(startx,starty, endx, endy);
		
	}
}
