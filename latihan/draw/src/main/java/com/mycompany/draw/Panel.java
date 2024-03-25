
package com.mycompany.draw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author mrkuncay
 */
public class Panel extends JPanel{

    // ini untuk menggambar atau menulis string
    
    @Override
    public void paint(Graphics g) {
        // ini untuk membuat background gambarnya
        super.paint(g);
        g.setColor(Color.white);
        
        // ini untuk menulis kata
        g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        g.drawString("SLOW AJA BOSS, KALO GAK GANTENG MINIMAL S.KOM ! KALAU PUSING TINGGAL MICHAT", 700, 70);
//        // ini untuk membuat persegi
//        g.drawRect(100, 200, 100, 50);
//        g.fillRect(100, 200, 100, 50);
//        
//        int x[]= {100,200,300};
//        int y[]= {400,300,400};
//        int n=3;
//        g.fillPolygon(x,y,n);
    }
    
    
}

/* 
    SLOW AJA BOSS, KALO GAK GANTENG MINIMAL S.KOM
*/