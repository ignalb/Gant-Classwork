package chapter7;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project7_11 {

	public static void main(String[] args){
		JFrame window = new JFrame("Circles");
		CirclePanel panel = new CirclePanel();
		panel.addCircle(new Circle_Moving(50, 200, 50, Color.BLUE, 5, 0));
		panel.addCircle(new Circle_Moving(435, 200, 50, Color.ORANGE, 5, 180));
		
		window.setSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setVisible(true);
	}
	
}
