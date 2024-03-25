package com.mycompany.draw;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mrkuncay
 */
public class animasi extends JPanel{

    int x=0;
    int y=100;
    int a=700;
    int b=140;
    
    @Override
    public void paint (Graphics gp) {
         super.paint(gp);
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.red);
        g2d.setBackground(Color.black);
        g2d.setFont(new Font(Font.SERIF, BOLD, 40));
            
        g2d.drawString("SLOW AJA BOSS, KALO GAK GANTENG MINIMAL S.KOM !!! KALAU PUSING TINGGAL MICHAT", a, b);
        try {
            Thread.sleep(50);
            a-=20;
      
        repaint();
         
        } catch(InterruptedException ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
}