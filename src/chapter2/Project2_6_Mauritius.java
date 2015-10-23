package chapter2;

import java.awt.Color;

import javax.swing.JFrame;

public class Project2_6_Mauritius {

	public static void main(String[] args){
		JFrame window = new JFrame("Mauritius");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(720, 480);
		
		Flag mauritianFlag = new Flag(window, 4, true);
		mauritianFlag.changeColor(1, Color.RED);
		mauritianFlag.changeColor(2, Color.BLUE);
		mauritianFlag.changeColor(3, Color.YELLOW);
		mauritianFlag.changeColor(4, Color.GREEN);
		mauritianFlag.addFrameComponents(window);
		window.setVisible(true);
	}
	
}
