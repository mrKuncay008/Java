
package com.mycompany.mygame;

import entity.Player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author kunca
 */
public class GamePanel extends JPanel implements Runnable{
    // game setting
    final int originalfileSize = 16; //16 x 16 tile
    final int scale = 3;
    public final int tileSize = originalfileSize * scale; // 48x48 resulusi size
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixel
    final int screenHeigth = tileSize * maxScreenRow; // 576 pixel
    
    //fps
    int FPS = 60;
    
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    Player player;
    // set default pemainnya
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;
    
    /**
     *
     */
    public GamePanel() throws IOException 
    {
        this.player = new Player(this,keyH);
        this.setPreferredSize(new Dimension(screenWidth, screenHeigth));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
//        double drawInterval = 1000000000/FPS; // 0.01666 /detik
//        double nextDrawTime = System.nanoTime() + drawInterval;
//        while(gameThread != null) {
//           
//            long currentTime = System.nanoTime();
//             System.out.println("Waktu Yg Berjalan; " + currentTime);
//            // 1. Update: update informasi lagi dan lagi
//            update();
//            
//            // 2. Gambar: menggambar screen dengan informasi yg uppdate
//            repaint();         
//            
//            try {
//                double remainingTime = nextDrawTime - System.nanoTime();
//                remainingTime = remainingTime/1000000000;
//                
//                if(remainingTime < 0) {
//                    remainingTime = 0;
//                } 
//                Thread.sleep((long)remainingTime);
//                nextDrawTime += drawInterval;
//                
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
   
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long Timer = 0;
        int drawCount = 0;
        
        while(gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            Timer += (currentTime - lastTime);
            lastTime = currentTime;
            
            if(delta >= 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }
            if(Timer >= 1000000000) {
                System.out.println("FPS: " + drawCount);
                drawCount = 0;
                Timer = 0;
            }
        }
    
    }

    public void update() {
       player.update();
    }
    @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       Graphics2D g2 = (Graphics2D)g;
   
       player.draw(g2);
       g2.dispose();
    }

  }
