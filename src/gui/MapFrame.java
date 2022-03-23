package gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MapFrame extends JFrame {
	public MapPanel mapPanel;
	
	public MapFrame() {
		
		mapPanel = new MapPanel();
		
		this.add(mapPanel);
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("火星");
		this.setSize(900,900);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
		
	}

}
