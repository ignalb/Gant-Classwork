package chapter7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CirclePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3338934820388885446L;
	private static final Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue};
	static int i = 0;
	
	Circle_Spinning circle;

	ActionListener taskPerformer = new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {
			circle.move();
			circle.turn(3);
			circle.setColor(colors[i % colors.length]);
			i++;
			repaint();
		}
	};
	Timer timer = new Timer(33, taskPerformer);
	
	public CirclePanel(Circle_Spinning circle){
		this.circle = circle;
		timer.start();
	}
	public CirclePanel(int x, int y, int r, Color c, int s, int dir){
		circle = new Circle_Spinning(x, y, r, c, s, dir);
		timer.start();
	}
	
	public void paintComponent(Graphics g){
		circle.fill(g);
	}
}
