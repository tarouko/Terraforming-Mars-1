package gui;

import java.awt.Color;
import java.awt.Graphics;

public class Map {
public static MapFrame mapFrame;

public Map() {
	mapFrame = new MapFrame();
	Graphics gra = mapFrame.mapPanel.image.getGraphics();
	
	gra.setColor(Color.WHITE);
    gra.fillRect(0, 0, 900, 900);
    
    gra.setColor(Color.BLACK);
    gra.fillRect(300, 0, 100, 100);
    
    gra.setColor(Color.BLACK);
    gra.fillRect(100, 100, 100, 100);
    
    
    
    
    
	
}
public static void putOceanGraphics() {
	System.out.println("check");
	Graphics graOcean = mapFrame.mapPanel.image.getGraphics();
	graOcean.setColor(Color.BLUE);
    int centerX = 500;
    int centerY = 500; 
    int size = 2;
    int[] x = {centerX+10*size, centerX+20*size,centerX+10*size,centerX-10*size,centerX-20*size,centerX-10*size};
    int[] y = {centerY+17*size, centerY,centerY-17*size,centerY-17*size,centerY,centerY+17*size,};
    graOcean.fillPolygon(x,y,6);
}
}
