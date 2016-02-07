package chapter04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Project4_13 {

	public static void main(String[] args){
		JFrame window = new JFrame("Optical Illusion");
		window.setSize(900, 600);
		window.setLayout(new GridLayout(1, 2));
		
		ColorPanel black = new ColorPanel(Color.BLACK);
		ColorPanel white = new ColorPanel(Color.WHITE);
		black.add(new ColorPanel(Color.LIGHT_GRAY, 200, 200), BorderLayout.CENTER);
		white.add(new ColorPanel(Color.LIGHT_GRAY, 200, 200), BorderLayout.CENTER);
		window.add(black);
		window.add(white);
		
		window.setVisible(true);
	}
	
}
