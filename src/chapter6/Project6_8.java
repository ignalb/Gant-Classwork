package chapter6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Project6_8 {
	
	public static void main(String[] args){
		JFrame window = new JFrame("Rectangles");
		RectPanel pane = new RectPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane.setPreferredSize(new Dimension(720, 480));
		pane.addRectangle(new Rectangle(Color.black, 250, 250));
		pane.addRectangle(new Rectangle(Color.blue, 250, 250, 90));
		
		window.add(pane);
		window.pack();
		window.setVisible(true);
	}
	
}

class RectPanel extends JPanel {
	private static final long serialVersionUID = -670289133498991509L;
	
	private ArrayList<Rectangle> rects;
	public int magnitude = 5;
	
	ActionListener task = new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			for(Rectangle rect : rects){
				rect.move(magnitude);
				if(rect.getX() <= 0 || rect.getX() >= getWidth() || rect.getY() <= 0 || rect.getY() >= getHeight()){
					rect.addToDirection(90);
				}
			}
			repaint();
		}
	};
	Timer timer = new Timer(33, task);
	
	public RectPanel(){
		super();
		rects = new ArrayList<Rectangle>();
		timer.start();
	}
	
	public void addRectangle(Rectangle rect){
		rects.add(rect);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Rectangle rect : rects){
			rect.fill(g);
		}
	}
	
}

class Rectangle {
	private Color color;
	private int xPos, yPos;
	private int xScale, yScale;
	private double dir;	//in degrees
	
	public Rectangle(int x, int y){
		this(Color.blue, x, y);
	}
	public Rectangle(Color c, int x, int y){
		this(c, x, y, 0);
	}
	public Rectangle(Color c, int x, int y, double dir){
		this(c, x, y, 100, 100, dir);
	}
	public Rectangle(Color c, int xPos, int yPos, int xScale, int yScale){
		this(c, xPos, yPos, xScale, yScale, 0);
	}
	public Rectangle(Color c, int xPos, int yPos, int xScale, int yScale, double dir){
		color = c;
		this.xPos = xPos;
		this.yPos = yPos;
		this.xScale = xScale;
		this.yScale = yScale;
		this.dir = dir;
	}
	
	public Color getColor(){
		return color;
	}
	public int getX(){
		return xPos;
	}
	public int getY(){
		return yPos;
	}
	public int getWidth(){
		return xScale;
	}
	public int getHeight(){
		return yScale;
	}
	public double getDirection(){
		return dir;
	}
	
	public void setColor(Color c){
		color = c;
	}
	public void move(int x, int y){
		xPos += x;
		yPos -= y;
	}
	public void move(int amount){
		double rads = Math.toRadians(dir);
		move((int)Math.cos(rads) * amount, (int)Math.sin(rads) * amount);
	}
	public void setDirection(double dir){
		this.dir = dir % 360;
	}
	public void addToDirection(double dir){
		setDirection(this.dir + dir);
	}
	
	public void draw(Graphics g){
		Color prev = g.getColor();
		g.setColor(color);		
		g.drawRect(xPos - xScale/2, yPos - yScale/2, xScale, yScale);
		g.setColor(prev);
	}
	public void fill(Graphics g){
		Color prev = g.getColor();
		g.setColor(color);		
		g.fillRect(xPos - xScale/2, yPos - yScale/2, xScale, yScale);
		g.setColor(prev);
	}
	
}
