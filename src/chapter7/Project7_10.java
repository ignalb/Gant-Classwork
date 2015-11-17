package chapter7;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Project7_10 {

	public static void main(String[] args){
		JFrame window = new JFrame("Circle");
		CirclePanel panel = new CirclePanel(new Circle_Spinning(250, 250, 50, Color.BLUE, 3, 0));
		
		window.setSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setVisible(true);
	}
	
}
