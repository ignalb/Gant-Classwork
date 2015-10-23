package chapter2;

import java.awt.Color;

import javax.swing.JFrame;

public class Project2_6_Bulgaria {

	public static void main(String[] args){
		JFrame window = new JFrame("Bulgaria");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(720, 480);
		
		Flag bulgarianFlag = new Flag(window, 3, true);
		bulgarianFlag.changeColor(1, Color.WHITE);
		bulgarianFlag.changeColor(2, Color.GREEN);
		bulgarianFlag.changeColor(3, Color.RED);
		bulgarianFlag.addFrameComponents(window);
		window.setVisible(true);
	}
	
}
