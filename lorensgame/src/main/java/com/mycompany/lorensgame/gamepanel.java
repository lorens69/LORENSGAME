
package com.mycompany.lorensgame;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;


public class gamepanel extends JPanel implements Runnable {
    
    //Screen Settings
    final int originalTileSize = 16; // 16 x 16 tile
    final int scale = 3;
    
    final int tileSize = originalTileSize * scale; //48 x 48 tile
    final int maxScreenCol = 16;
    final int maxSCreenRow = 12;
    final int sreenWidth = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxSCreenRow; // 576 pixels
    
    Thread gameThread;
    
    public gamepanel(){
        
        this.setPreferredSize(new Dimension(sreenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
    
    public void startGameThread() {
        
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        
        while(gameThread != null) {
        
          //  System.out.println("The game loop is running");
          
          update();
          
          repaint();
    }
        
    }
    
    public void update(){
        
    }
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
    }
}
