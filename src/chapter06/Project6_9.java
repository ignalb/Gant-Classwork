package chapter06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Project6_9 {

	public static void main(String[] args){
		final int WIDTH = 8, HEIGHT = 8;
		Tile[][] tiles = new Tile[WIDTH][HEIGHT];
		JFrame window = new JFrame("Tiles");
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new GridLayout(8,8));
		
		for(int j = 0; j < HEIGHT; j++){
			for(int i = 0; i < WIDTH; i++){
				tiles[j][i] = new Tile(Color.white);
				tiles[j][i].setPreferredSize(new Dimension(100, 100));
				window.add(tiles[j][i]);
			}
		}
		
		window.pack();
		window.setVisible(true);
	}
	
}

class Tile extends JPanel implements MouseListener {
	private static final long serialVersionUID = -2003011435323731071L;
	
	private Random rand = new Random();
	
	public Tile(Color c){
		super();
		this.setBackground(c);
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		int r = rand.nextInt(255);
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		this.setBackground(new Color(r,g,b));
	}
	@Override
	public void mouseEntered(MouseEvent arg0) { }
	@Override
	public void mouseExited(MouseEvent arg0) { }
	@Override
	public void mousePressed(MouseEvent arg0) { }
	@Override
	public void mouseReleased(MouseEvent arg0) { }
		
}
