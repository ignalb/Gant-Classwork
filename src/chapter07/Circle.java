package chapter07;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {

	Color color;
	int centerX, centerY, radius;
	
	public Circle(int x, int y, int r, Color c){
		centerX = x;
		centerY = y;
		radius = r;
		color = c;
	}
	
	public int getX(){
		return centerX;
	}
	public void setX(int x){
		centerX = x;
	}
	public int getY(){
		return centerY;
	}
	public void setY(int y){
		centerY = y;
	}
	public int getRadius(){
		return radius;
	}
	public void setRadius(int r){
		radius = r;
	}
	public Color getColor(){
		return color;
	}
	public void setColor(Color c){
		color = c;
	}
	
	public void draw(Graphics g){
		Color oldColor = g.getColor();
		g.setColor(color);
		g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
		g.setColor(oldColor);
	}
	public void fill(Graphics g){
		Color oldColor = g.getColor();
		g.setColor(color);
		g.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
		g.setColor(oldColor);
	}
	
	public void move(int xAmount, int yAmount){
		centerX += xAmount;
		centerY -= yAmount;
	}
}
