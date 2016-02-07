package chapter04;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

/**
 * 
 * @author Ignacio Pacheco
 *
 */
public class ColorPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7471361185141879901L;

	public ColorPanel(Color c){
		this.setBackground(c);
	}
	
	public ColorPanel(Color c, int w, int h){
		this.setBackground(c);
		this.setPreferredSize(new Dimension(w, h));
	}
	
}
