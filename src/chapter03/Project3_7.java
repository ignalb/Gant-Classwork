package chapter03;

import java.awt.Color;

import javax.swing.JFrame;

public class Project3_7 {

	public static void main(String[] args){
		JFrame window = new JFrame("Center Coordinates");
		window.setSize(720, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(new CenterPanel(Color.white));
		window.setVisible(true);
	}
	
}
