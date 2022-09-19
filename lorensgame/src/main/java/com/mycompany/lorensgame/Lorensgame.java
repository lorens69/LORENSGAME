

package com.mycompany.lorensgame;

import javax.swing.JFrame;

public class Lorensgame {

    public static void main(String[] args) {
       
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");
        
        gamepanel GamePanel = new gamepanel();
        window.add(GamePanel);
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        GamePanel.startGameThread();
    }
}
