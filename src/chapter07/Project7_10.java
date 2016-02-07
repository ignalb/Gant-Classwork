package chapter07;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class Project7_10 {

	public static void main(String[] args){
		JFrame window = new JFrame("Circle");
		CirclePanel panel = new CirclePanel();
		panel.addCircle(new Circle_Moving(200, 200, 50, Color.BLUE, 5, 0));
		
		window.setSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setVisible(true);
	}
	
}
