package com.mycompany.mygame;

<<<<<<< HEAD
import java.io.IOException;
=======
>>>>>>> 8ea2f1a (Update Linux)
import javax.swing.JFrame;

/**
 *
 * @author kunca
 */
public class Mygame {

<<<<<<< HEAD
    public static void main(String[] args) throws IOException {
=======
    public static void main(String[] args) {
>>>>>>> 8ea2f1a (Update Linux)
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("MyGame advanture");
        
<<<<<<< HEAD
        GamePanel gamePanel;
        gamePanel = new GamePanel();
=======
        GamePanel gamePanel = new GamePanel();
>>>>>>> 8ea2f1a (Update Linux)
        window.add(gamePanel);
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gamePanel.startGameThread();
    }
}
