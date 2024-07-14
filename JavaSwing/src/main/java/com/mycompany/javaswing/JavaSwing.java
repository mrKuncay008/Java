package com.mycompany.javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JavaSwing {
    
    private JTextField field1;
    private JTextField field2;
    private JLabel hasil;
    
    public JavaSwing() {
        runComponents();
    }
    
    private void runComponents() {
        // ==== Bagian Container =====
        JFrame form = new JFrame("App Penjumlahan");
        form.setSize(350, 388);

        
        // ==== Bagian Component ====
        JLabel judul = new JLabel(); //judul
        judul.setText("Penjumlahan");
        judul.setBounds(113, 24, 113, 24);
        
        JLabel label1 = new JLabel(); // label A
        label1.setText("Masukan angka A = ");
        label1.setBounds(40, 60, 150, 24);
        
        JLabel label2 = new JLabel(); // label B
        label2.setText("Masukan angka B = ");
        label2.setBounds(40, 90, 150, 24);
        
        JTextField field1 = new JTextField(); // field 1
        field1.setBounds(150, 60, 90, 24);
        
        JTextField field2 = new JTextField(); // field 2
        field2.setBounds(150, 90, 90, 24);
        
        
        JButton button = new JButton(); // Button submit
        button.setText("Jumlahkan");
        button.setBounds(130, 130, 100, 24);
       
       // ==================================================/// 
        
        JLabel hasil = new JLabel(); // hasil
        hasil.setBounds(130, 180, 160, 24);
        hasil.setFont(new java.awt.Font("Arial", 0, 18));
        hasil.setHorizontalAlignment(SwingConstants.CENTER);
        
        // === End ====
        form.add(judul); form.add(label1); form.add(label2);
        form.add(field1); form.add(field2); form.add(button);
        form.add(hasil);
        
        // bagian config 
        label1.setFont(new java.awt.Font("Segoe UI Variable",0, 12));
        label2.setFont(new java.awt.Font("Segoe UI Variable",0, 12));
        judul.setFont(new java.awt.Font("Segoe UI Variable", 1, 18));
        form.setLocationRelativeTo(null);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
        
         // ===== Event handler untuk tombol Jumlahkan ====
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ambil nilai dari field1 dan field2
                String angkaA = field1.getText();
                String angkaB = field2.getText();

                // Konversi nilai ke integer
                int angka1 = Integer.parseInt(angkaA);
                int angka2 = Integer.parseInt(angkaB);

                // Hitung jumlahnya
                String hasilJumlah = "Hello World";

                // Tampilkan hasilnya di label hasil
                hasil.setText( hasilJumlah);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(form, "Masukan Angka Yang Valid ");
                }
                
            }
        });
    }
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(JavaSwing::new);
    }

}
