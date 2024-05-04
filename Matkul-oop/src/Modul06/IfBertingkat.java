package Modul06;

import java.util.Scanner;
import javax.swing.tree.ExpandVetoException;

/**
 *
 * @author kunca
 */
public class IfBertingkat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Konversi Nilai menjadi huruf");
            System.out.println("============================");
            
            System.out.print("Masukan Nilai : ");
            double nilai = in.nextInt();
            
            System.out.print("\nNilai anda  : ");
            
            if ((nilai >= 0) & (nilai <= 40)) {
                System.out.println("E");
                System.out.println("Predikat : Gagal" );
            }
            else if ((nilai > 40) & (nilai <= 55)) {
                System.out.println("D");
                System.out.println("Predikat : Buruk" );
            }
             else if ((nilai > 55) & (nilai <= 65)) {
                System.out.println("C");
                System.out.println("Predikat : Cukup" );
            }
             else if ((nilai > 65) & (nilai <= 79)) {
                System.out.println("B");
                System.out.println("Predikat : Baik" );
            }
             else if ((nilai >= 80) & (nilai <= 100)) {
                System.out.println("A");
                System.out.println("Predikat : Baik Sekali" );
            }
             else if ((nilai < 0) || (nilai > 100)) {
                System.out.println("Invalid Data Input");
             
            }
        }
        catch (Exception e) {
             
                System.out.println("Tidak Boleh Mengimput Karakter " + e );
        }
        System.out.println();
    }
}
