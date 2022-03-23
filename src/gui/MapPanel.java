package gui;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class MapPanel extends JPanel {
	public BufferedImage image;
	
	public MapPanel(){
		super();
		this.image = new BufferedImage(900, 900, BufferedImage.TYPE_INT_RGB);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image,0,0,this);
	}
	
	public void drow() {
		this.repaint();
	}

}
