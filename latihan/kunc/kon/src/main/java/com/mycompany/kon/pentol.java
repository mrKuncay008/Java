package com.mycompany.kon;
//@author mrkuncay

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;




public class pentol extends JPanel {
    
    pentol() {
        
    }
      @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setBackground(Color.BLACK);
        g2D.setPaint(Color.pink);
        // menggambar B A    KIr KAN        besar
        g2D.fillArc(220,150,100,100,0,180);
        g2D.setColor(Color.red);
        g2D.fillRect(220, 200,100,200); 
        g2D.setColor(Color.pink);
        g2D.fillOval(170, 330, 100, 100);
        g2D.setColor(Color.pink);
        g2D.fillOval(280, 330, 100, 100);
        
        g2D.setColor(Color.white);
         g2D.setFont(new Font(Font.SERIF, BOLD, 20));
            
        g2D.drawString("ini adalah... ", 100,150);
        
    }

}
