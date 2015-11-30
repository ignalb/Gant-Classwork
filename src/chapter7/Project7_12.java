package chapter7;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project7_12 {

	public static void main(String[] args){
		JFrame window = new JFrame("Circles");
		CirclePanel panel = new CirclePanel();
		panel.addCircle(new Circle_Moving(100, 200, 50, Color.BLUE, 5, 120));
		panel.addCircle(new Circle_Moving(400, 200, 50, Color.ORANGE, 5, 30));
		
		window.setSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setVisible(true);
	}
	
}
