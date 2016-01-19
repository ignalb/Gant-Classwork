package chapter6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import chapter6.lib.example6_2.ColorPanel;


public class Project6_7 {
	public final static String path = "src/chapter6/resources/";
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		JFrame gui = new JFrame("Images");
		ImageIcon[] imgs;
		ColorPanel[] panels;
		int num;
		
		System.out.print("Number of images to dispay: ");
		num = in.nextInt();
		in.nextLine();
		
		switch(num){
			case 1:	case 2:	case 4:
				imgs = new ImageIcon[num];
				panels = new ColorPanel[num];
				break;
			default:
				System.err.println("ERROR: Unsupported number of images: " + num + "\n\t" 
						+ "valid numbers: 1, 2, 4");
				in.close();
				return;
		}
		
		for(int i = 0; i < num; i++){
			System.out.print("Image " + (i+1) + " filename: ");
			String filename = path + in.nextLine();
			imgs[i] = new ImageIcon(filename);
		}
		
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout layout = (num == 1) ? new GridLayout(1,1) : (num == 2) ? new GridLayout(1,2) : new GridLayout(2,2);
		gui.setLayout(layout);
		
		for(int i = 0; i < num; i++){
			panels[i] = new ColorPanel(Color.black, imgs[i]);
			panels[i].setPreferredSize(new Dimension(1920/(int)Math.sqrt(num), 1080/(int)Math.sqrt(num)));
			gui.getContentPane().add(panels[i]);
		}
		
		gui.pack();
		gui.setVisible(true);
		in.close();
	}
	
}
