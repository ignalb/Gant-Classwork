package chapter3;

import java.awt.Color;

import javax.swing.JFrame;

public class Project3_6 {
	
	public static void main(String[] args){
		JFrame window = new JFrame("Müller-Lyer Illusion");
		window.setSize(720, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(new MüllerLyer_Panel(Color.WHITE));
		window.setVisible(true);
	}
	
}
