package com.mycompany.text;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ccs
 */
public class Text extends JPanel{

    int x=0;
    int y=100;
    int a=700;
    int b=140;
    
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame jf = new JFrame();
        jf.setSize(800, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Text());
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setBackground(Color.black);
    }
    
    
     public void paint(Graphics gp)
    {
        super.paint(gp);
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.red);
        g2d.setBackground(Color.black);
        g2d.setFont(new Font(Font.SERIF, BOLD, 90));
            
        g2d.drawString("SLOW AJA BOSS, KALO GAK GANTENG MINIMAL S.KOM !!! KALAU PUSING TINGGAL MICHAT", a, b);
                try {
            Thread.sleep(80);
           
            a-=20;
           
        repaint();
                      
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    
        
        
    }
    
}