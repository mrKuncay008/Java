package uts.pbo.Frendi1049;
import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Input data Pasien
        System.out.println("=== Form Pasien Baru ===");
        System.out.print("Kode Pasien: ");
        String kodePasien = input.nextLine();
        System.out.print("Nama: ");
        String namaPasien = input.nextLine();
        System.out.print("Email: ");
        String emailPasien = input.nextLine();
        Pasien pasien = new Pasien(kodePasien, namaPasien, emailPasien);
        
         // Input data Screening
        System.out.println("\n=== Form Screening ===");
        System.out.print("Apakah Anda mengalami batuk/pilek? (ya/tidak): ");
        boolean batukPilek = input.nextLine().equalsIgnoreCase("ya");
        System.out.print("Apakah Anda mengalami demam? (ya/tidak): ");
        boolean demam = input.nextLine().equalsIgnoreCase("ya");
        Screening screening = new Screening(batukPilek, demam);

        // Menentukan apakah pasien terindikasi Covid-19
        if (screening.teridikasiCovid()) {
            System.out.println("\nSilahkan Pulang. Anda terindikasi Covid-19.");
            return;
        } else {
            System.out.println("\nLanjutkan pemeriksaan.");
        }
        
        // Objek Pembayaran
       Dokter dokterUmum = new Dokter("Dr. Tono", "Umum", 300000);
        Dokter dokterSpesialis = new Dokter("Dr. budi","Spesialis", 500000);
        int administrasi = 100000;
        int kartuBerobat = 25000;
        int Tindakan = 0;
        
        Pembayaran bayar = new Pembayaran(pasien, dokterUmum, administrasi, kartuBerobat, Tindakan);
         // Menampilkan informasi pembayaran
        bayar.tampilInformasiPembayaran();
        input.close();
    }
}
