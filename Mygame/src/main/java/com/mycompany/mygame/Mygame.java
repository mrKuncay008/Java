package com.mycompany.mygame;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author kunca
 */
public class Mygame {

    public static void main(String[] args) throws IOException {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("MyGame advanture");
        
        GamePanel gamePanel;
        gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gamePanel.startGameThread();
    }
}
