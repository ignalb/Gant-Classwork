package chapter03;

import java.awt.*;

import javax.swing.JPanel;

public class CenterPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CenterPanel(Color c){
		this.setBackground(c);
	}
	
	public void paintComponent(Graphics g){
		int w = getWidth();		// gets the current width
		int h = getHeight();	// gets the current height
		
		int x = w/2;
		int y = h/2;
		String coords = "(" + x + ", " + y + ")";
		FontMetrics fm = g.getFontMetrics();
		
		g.drawString(coords, x - fm.stringWidth(coords)/2, y);
	}
	
}
