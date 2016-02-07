package chapter04;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
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
		panels = new ColorPanel[w*h];
		this.setLayout(new GridLayout(height, width));
		this.setTitle("Checkerboard");
		this.setSize(600, 600);
		
		if(width % 2 == 0){
			addEvenPattern();
		} else {
			addOddPattern();
		}
		
	}
	
	private void addEvenPattern() {
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				if(i % 2 == 0){
					if(j % 2 == 0){
						panels[i] = new ColorPanel(color1);
					} else {
						panels[i] = new ColorPanel(color2);
					}
				} else {
					if(j % 2 == 0){
						panels[i] = new ColorPanel(color2);
					} else {
						panels[i] = new ColorPanel(color1);
					}
				}
				this.add(panels[i]);
			}
		}
		
	}

	public void addOddPattern(){
		for(int i = 0; i < height * width; i++){
			if(i % 2 == 0){
				panels[i] = new ColorPanel(color1);
			} else {
				panels[i] = new ColorPanel(color2);
			}
			this.add(panels[i]);
		}
	}
	
}
