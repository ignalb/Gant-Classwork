package chapter02;

import java.awt.Color;

import javax.swing.JFrame;

public class Project2_6_France {

	public static void main(String[] args) {
		JFrame window = new JFrame("France");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(720, 480);
		
		Flag frenchFlag = new Flag(window, 3, false);
		frenchFlag.changeColor(1, Color.BLUE);
		frenchFlag.changeColor(2, Color.WHITE);
		frenchFlag.changeColor(3, Color.RED);
		frenchFlag.addFrameComponents(window);
		window.setVisible(true);
	}

}
