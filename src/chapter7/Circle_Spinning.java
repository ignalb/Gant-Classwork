package chapter7;

import java.awt.Color;

public class Circle_Spinning extends Circle {

	int speed, direction;
	
	public Circle_Spinning(int x, int y, int r, Color c, int s, int dir){
		super(x, y, r, c);
		speed = s;
		direction = dir;
	}
	
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int s){
		speed = s;
	}
	public int getDirection(){
		return direction;
	}
	public void setDirection(int deg){
		direction = deg % 360;
	}
	
	public void turn(int deg){
		direction = (direction + deg) % 360;
	}
	
	public void move(){
		move((int)(speed * Math.cos(Math.toRadians(direction))),
			 (int)(speed * Math.sin(Math.toRadians(direction))));
	}
}
