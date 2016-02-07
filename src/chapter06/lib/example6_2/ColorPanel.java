package chapter06.lib.example6_2;
// Displays an image centered in the panel

import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel{
	private static final long serialVersionUID = 3638234089243575133L;
	
	private ImageIcon image;
	
   public ColorPanel(Color backColor, ImageIcon i){
      setBackground(backColor);
      image = i;
   }
	
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      int x = (getWidth() - image.getIconWidth()) / 2;
      int y = (getHeight() - image.getIconHeight()) / 2;
      image.paintIcon(this, g, x, y);
   }
}