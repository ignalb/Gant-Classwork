package chapter4;

import java.awt.Color;

import javax.swing.JFrame;

public class Checkerboard extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6538002254770684853L;

	private static Color color1;
	private static Color color2;
	private static int width;
	private static int height;
	private static ColorPanel[] panels;
	
	/***
	 * Constructor for the Checkerboard class<br>Sets dimensions and colors
	 * @param w Width
	 * @param h Height
	 * @param c1 1st Color
	 * @param c2 2nd Color
	 */
	public Checkerboard(int w, int h, Color c1, Color c2){
		color1 = c1;
		color2 = c2;
		width = w;
		height = h;
	}
	
	public static void main(String[] args){
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				//TODO finish
			}
		}
	}
	
}
