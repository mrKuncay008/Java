package com.mycompany.kon;
 //* @author mrkuncay

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Kon extends JFrame {

    public static void main(String[] args) {
       JPanel pentol = new JPanel();
       JFrame kon = new JFrame();
       pentol = new pentol();
       kon.add(pentol);
       kon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       kon.setSize(600,600);
       kon.setLocationRelativeTo(null);
       kon.setVisible(true);
       kon.setBackground(Color.black);
    }  

}
