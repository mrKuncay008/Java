
package com.mycompany.draw;
// author mr kuncay

import java.awt.Color;
import javax.swing.JFrame;

// ini adalah bagian untuk frame

public class Draw extends JFrame{

    Draw(){
        setSize(800, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(550, 25);
        Panel panel= new Panel(); // new panel
        panel.setBackground(Color.black); //bg frame
        setLocationRelativeTo(null);
        add(panel); // memanggil panel
        
    }
    
    public static void main(String[] args) {
        new Draw().setVisible(true); 
    }
}
