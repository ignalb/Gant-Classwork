package chapter07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CirclePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3338934820388885446L;
	
	ArrayList<Circle_Moving> circles = new ArrayList<Circle_Moving>();

	ActionListener taskPerformer = new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			for(Circle_Moving c : circles){
				//System.out.printf("x=%3d y=%3d s=%3d dir=%3d\n", c.getX(), c.getY(), c.getSpeed(), c.getDirection());
				c.move();
				bounce(c);
			}
			repaint();
		}
	};
	Timer timer = new Timer(33, taskPerformer);
	
	public CirclePanel(){
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e){
				if(timer.isRunning()){
					timer.stop();
				} else {
					timer.start();
				}
			}
		});
		timer.start();
	}
	public void addCircle(Circle_Moving c){
		circles.add(c);
	}
	public void addCircle(int x, int y, int r, Color c, int s, int dir){
		circles.add(new Circle_Moving(x, y, r, c, s, dir));
	}
	
	public void bounce(Circle_Moving c){
		int dir = c.getDirection();
		if(atXBorder(c) && atYBorder(c)){
			c.turn(180);
		} else if(atXBorder(c)){
			c.turn(180 - 2*dir);
		} else if(atYBorder(c)){
			c.turn(-2 * dir);
		}
	}
	public boolean atXBorder(Circle c){
		int x = c.getX(), r = c.getRadius();
		return (x+r >= getWidth() || x-r <= 0) ? true : false;
	}
	public boolean atYBorder(Circle c){
		int y = c.getY(), r = c.getRadius();
		return (y+r >= getHeight() || y-r <= 0) ? true : false;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Circle_Moving c : circles){
			c.fill(g);
		}
	}
}
