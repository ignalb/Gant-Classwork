package chapter02;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flag {
	static JPanel[] stripes;
	
	/**
	 * @param country Name of Country
	 * @param stripes Number of stripes
	 * @param isHorizontal if the stripes are laid out horizontally or vertically 
	 */
	public Flag(JFrame frame, int stripes, boolean isHorizontal) {		
		Flag.stripes = new JPanel[stripes];
		GridLayout layout;
		
		if(isHorizontal){
			layout = new GridLayout(stripes, 1);
		} else {
			layout = new GridLayout(1, stripes);
		}
		
		frame.setLayout(layout);
		makePanels(stripes);
	}
	
	private static void makePanels(int stripeNum) {
		for(int i = 0; i < stripeNum; i++){
			stripes[i] = new JPanel();
		}
	}
	
	public void addFrameComponents(JFrame frame) {
		for(int i = 0; i < stripes.length; i++){
			frame.add(stripes[i]);
		}
	}
	
	public boolean changeColor(int stripe, Color color) {
		if(stripe < 0 || stripe > stripes.length){
			return false;
		} else {
			stripes[stripe-1].setBackground(color);
			return true;
		}
	}
}
