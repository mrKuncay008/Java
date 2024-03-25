
package toko;

import java.util.Scanner;

public class Toko {
    public static void main(String[] args) {
        String nama, alamat, prov;
        int pos, tlp;
        
        int algo, db, comp, oop, andro;
        
        // membuat scanner untuk input
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\tWelcome to Course-Net");
        System.out.println("\t=====================");
        
        // tampilkan output
        System.out.print("Masukan nama lengkap anda     : ");
        // perbaikan: gunakan nextLine() untuk menerima input String
        nama = keyboard.nextLine();
        
      
        System.out.print("Masukan alamat  anda          : ");
        alamat = keyboard.nextLine();
        
        System.out.print("Masukan kode pos  anda        : ");
        pos = keyboard.nextInt();
        keyboard.nextLine();
       
        System.out.print("Masukan provinsi  anda        : ");
        prov = keyboard.nextLine();
       
        System.out.print("Masukan no telp  anda         : ");
        tlp = keyboard.nextInt();
        

// di bawah ini adalah object yang bernama Khursus        
         Kursus[] kursus;
        kursus = new Kursus[] {
            new Kursus("Algoritma Pemrograman", 5000),
            new Kursus("Database", 10000),
            new Kursus("Computer", 15000),
            new Kursus("OOP", 20000),
            new Kursus("Android Studio", 25000)
        };
          // input daftar kursus yang diambil
        System.out.println("Hello " + nama);
        System.out.println("List Program Pembelajaran yang tersedia");
        for (int i = 0; i < kursus.length; i++) {
        System.out.println((i + 1) + ". " + kursus[i].getNama() + " - Rp " + kursus[i].getHarga());
        System.out.print("   Apakah ingin diambil? (1 untuk ya / 0 untuk tidak): ");
        int choice = keyboard.nextInt();
        if (choice == 1) {
        kursus[i].setDiambil(true);
            }
        }

        // hitung total biaya
        int totalBiaya = 0;
        for (Kursus k : kursus) {
            totalBiaya += k.getTotalHarga();
        }

        
        // hasil output
        System.out.println("");
        System.out.println("\t--- INVOICE ---");
        System.out.println("Nama Lengkap    : " + nama);
        System.out.println("Almat           : " + alamat);
        System.out.println("Kode Pos        : " + pos);
        System.out.println("Provinsi        : " + prov);
        System.out.println("No. Telp        : " + tlp);
         System.out.println("");
         System.out.println("Total Biaya Khursus    : Rp. "+ totalBiaya + "\n");
         System.out.println("\tTerimakasih !!!");
    }

    // di  sini adalah class untuk object khursus
    private static class Kursus {
            private String nama;
            private int harga;
            private boolean diambil;
            
        public Kursus(String nama, int harga) {
            this.nama = nama;
            this.harga = harga;
            this.diambil = false;
        }
        public String getNama() {
            return nama;
        }
        
        public int getHarga() {
            return harga;
        }
        
        public boolean isDiambil() {
            return diambil;
        }
        
        public void setDiambil(boolean diambil) {
            this.diambil = diambil;
        }
        
        public int getTotalHarga() {
            if (diambil) {
                return harga;
            } else {
                return 0;
            }
        }
    }
    
}
