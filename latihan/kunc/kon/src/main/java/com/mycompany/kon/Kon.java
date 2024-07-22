package com.mycompany.kon;
 //* @author mrkuncay

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Kon extends JFrame {
/**
     * Metode utama untuk menjalankan program. 
     * Membuat sebuah JFrame baru (kon) dan menambahkan sebuah JPanel (pentol) ke dalamnya.
     * Mengatur properti JFrame dan menampilkan JFrame ke layar.
*/
    public static void main(String[] args) {
        // Membuat objek JPanel baru dengan nama pentol
        JPanel pentol = new JPanel();

        // Membuat objek JFrame baru dengan nama kon
        JFrame kon = new JFrame();

        // Menghubungkan objek JPanel (pentol) ke objek JFrame (kon)
        pentol = new pentol(); // Perlu dicek apakah ini sudah benar, karena 'pentol' tidak didefinisikan sebelumnya

        // Menambahkan JPanel (pentol) ke dalam JFrame (kon)
        kon.add(pentol);

        // Mengatur operasi penutupan default untuk JFrame (kon)
        kon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mengatur ukuran JFrame (kon)
        kon.setSize(600, 600);

        // Mengatur posisi JFrame (kon) agar muncul di tengah layar
        kon.setLocationRelativeTo(null);

        // Menampilkan JFrame (kon) ke layar
        kon.setVisible(true);

        // Mengatur warna latar belakang JFrame (kon) menjadi hitam
        kon.setBackground(Color.black);
    }  

}
