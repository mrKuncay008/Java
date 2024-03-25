
// impport scanner input ke program
import java.util.Scanner;

public class datakaryawan 
{
    public static void main(String[] args) 
     {   
        String nama, alamat;
        int usia, gaji;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        System.out.println("------- Pendataan karyawan PT sumifin ------\n");
        System.out.print("nama kryawan: ");

        // use scanner dan menyimpan variable
        nama = keyboard.nextInt();
        // tampilkan output
        System.out.print("Alamat: ");
        
        // menggunakan scanner lagi
        alamat = keyboard.nextInt();
        
        System.out.print("usia: ");
        usia = keyboard.nextInt();

        System.out.print("gaji: ");
        gaji = keyboard.nextInt();

        // menampilkan yg di simpan di variable
        System.out.println(" ");
        System.out.println("##### berikut data karyawan #####\n");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia);
        System.out.println("Nama: " + nama);

    }
}