import java.util.Scanner;

public class rental {
public static class masuk {
          static int jam; 
          static int menit;
          static int detik;
        }
                                    // tipedata struktur masuk        
public static class keluar {
        static int jam; 
        static int menit;
        static int detik;
        }
                                    // tipedata struktur keluar
    
    public static void main(String[] args) {
        
        int j, m, d, msk, klr, tot, biaya; // variable
        Scanner keyboard = new Scanner(System.in);

        // proses
         System.out.println("##### ------------ ####");     
         System.out.println(" ----- Rental ps ------\n"); 
        
         System.out.println("Masukan waktu masuk (format 24 jam)"); 
         System.out.print("jam: "); 
            masuk.jam = keyboard.nextInt(); System.out.println();
        System.out.print("menit: ");
            masuk.menit = keyboard.nextInt(); System.out.println();
        System.out.print("detik: ");
            masuk.detik = keyboard.nextInt(); System.out.println();

        System.out.println("Masukan waktu keluar (format 24 jam)"); 
        System.out.print("jam: "); 
           keluar.jam = keyboard.nextInt(); System.out.println();
        System.out.print("menit: ");
           keluar.menit = keyboard.nextInt(); System.out.println();
        System.out.print("detik: ");
           keluar.detik = keyboard.nextInt(); System.out.println();
        
        
        if (masuk.jam > keluar.jam)
        {
            msk = masuk.jam * 3600 + masuk.menit * 60 + masuk.detik;
            klr = 24 + keluar.jam * 3600 + keluar.menit * 60 + keluar.detik;
            tot = klr - msk;
            j = (tot / 3600);
            m = (tot % 3600 / 60);
            d = (tot % 3600 % 60);
             System.out.println ("Waktu rental anda adlah: " + j + " jam " +  m + " menit " + d + " detik."+ " WIB\n");

            biaya = tot / 3600 * 5000;
                System.out.print("total niaya nya adalah: Rp." +biaya + 1);

        } 
        else 
        {  
            msk = masuk.jam * 3600 + masuk.menit * 60 + masuk.detik;
            klr = keluar.jam * 3600 + keluar.menit * 60 + keluar.detik;
            tot = klr - msk;
            j = (tot / 3600);
            m = (tot % 3600 / 60);
            d = (tot % 3600 % 60);
            System.out.print ("Waktu rental anda adlah: " + j + " jam" +  m + " menit" + d + " detik"+ " WIB\n");

             biaya = tot / 3600 * 5000;
                 System.out.print("total biaya nya adalah: Rp." + biaya + "\n");
        }   
    }
}
