import java.util.Scanner;


public class toko_baru 
{
    public static void main(String[] args)
     {
        String nama, alamat, prov;
        int pos, tlp;
          int algo, db, comp, oop, andro;

        // membuat scanner untuk input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\tWelcome to Course-Net");
        System.out.println("\t=====================");

        System.out.print("Masukan nama lengkap anda     : ");
        nama = keyboard.nextLine();

        System.out.print("Masukan alamat  anda          : ");
        alamat = keyboard.nextLine();

        System.out.print("Masukan kode pos  anda        : ");
        pos = keyboard.nextInt();
        keyboard.nextLine(); // tambahkan ini untuk membersihkan karakter baru yang tertinggal di dalam buffer

        System.out.print("Masukan provinsi  anda        : ");
        prov = keyboard.nextLine();

        System.out.print("Masukan no telp  anda         : ");
        tlp = keyboard.nextInt();

        // di bawah ini adalah input harga nya


// menerima pilihan pengguna
System.out.println("List Program Pembelajaran yang tersedia:");
System.out.println("1 untuk diambil / 0 untuk tidak:\n");

System.out.print("Algoritma Pemrograman (Rp. 5000) : ");
algo = keyboard.nextInt();

System.out.print("Database (Rp. 10000) : ");
db = keyboard.nextInt();

System.out.print("Computer (Rp. 15000) : ");
comp = keyboard.nextInt();

System.out.print("OOP (Rp. 20000) : ");
oop = keyboard.nextInt();

System.out.print("Android Studio (Rp. 25000) : ");
andro = keyboard.nextInt();

// menghitung total biaya
int totalBiaya = 0;

if (algo == 1) {
    totalBiaya += 5000;
}
if (db == 1) {
    totalBiaya += 10000;
}
if (comp == 1) {
    totalBiaya += 15000;
}
if (oop == 1) {
    totalBiaya += 20000;
}
if (andro == 1) {
    totalBiaya += 25000;
}

// hasil output
System.out.println("\n--- INVOICE ---");
System.out.println("Nama Lengkap : " + nama);
System.out.println("Alamat : " + alamat);
System.out.println("Kode Pos : " + pos);
System.out.println("Provinsi : " + prov);
System.out.println("No. Telp : " + tlp);
System.out.println("");
System.out.println("Total Biaya Kursus : Rp. " + totalBiaya + "\n");
System.out.println("\tTerima kasih!");

    }
}