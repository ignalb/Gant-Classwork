package chapter4;

import java.awt.Color;

import javax.swing.JOptionPane;

/**
 * 
 * @author ignalb
 *
 */
public class Project4_12 {

	public static void main(String[] args){
		int width = Integer.parseInt(JOptionPane.showInputDialog("Please enter the width:"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Please enter the height:"));
		Checkerboard window = new Checkerboard(width, height, Color.RED, Color.BLACK);
		window.setVisible(true);
	}
	
}
