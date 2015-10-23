package chapter2;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Project2_7 {
	
	static void setColors(JPanel[] array) {
		for(int i = 0; i < array.length; i++){
			array[i] = new JPanel();
			if(i % 2 == 0){
				array[i].setBackground(Color.BLACK);
			} else {
				array[i].setBackground(Color.WHITE);
			}
		}
	}
	
	static void addSquares(JFrame frame, JPanel[] array){
		for(int i = 0; i < array.length; i++){
			frame.add(array[i]);
		}
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Checkerboard pattern");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600, 600);
		window.setLayout(new GridLayout(3, 3));
		
		JPanel[] squares = new JPanel[9];
		setColors(squares);
		addSquares(window, squares);
		window.setVisible(true);
	}
}
