package chapter03;

import java.awt.*;

import javax.swing.JPanel;

public class MüllerLyer_Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MüllerLyer_Panel(Color c){
		this.setBackground(c);
	}
	
	public void paintComponent(Graphics g){
		int width = getWidth();
		int height = getHeight();
		
		// Create top line
		g.drawLine(width/4, height/3, width/4*3, height/3);
			// Create left arrow
			g.drawLine(width/4, height/3, width/4 + 25, height/3 - 25);
			g.drawLine(width/4, height/3, width/4 + 25, height/3 + 25);
			// Create right arrow
			g.drawLine(width/4*3, height/3, width/4*3 - 25, height/3 - 25);
			g.drawLine(width/4*3, height/3, width/4*3 - 25, height/3 + 25);
		
		// Create bottom line
		g.drawLine(width/4, height/3*2, width/4*3, height/3*2);
			// Create left arrow
			g.drawLine(width/4, height/3*2, width/4 - 25, height/3*2 - 25);
			g.drawLine(width/4, height/3*2, width/4 - 25, height/3*2 + 25);
			// Create right arrow
			g.drawLine(width/4*3, height/3*2, width/4*3 + 25, height/3*2 - 25);
			g.drawLine(width/4*3, height/3*2, width/4*3 + 25, height/3*2 + 25);
	}
}
