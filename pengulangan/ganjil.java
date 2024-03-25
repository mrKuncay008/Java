package pengulangan;
import java.util.Scanner;

public class ganjil {
    public static void main(String[] args) {
        
        int awal, akhir, nilai;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" ------ ----- bilangan ganjil 1-10 ---- ----- --\n");
       
        System.out.print("masukan nilai awal: ");
        awal = keyboard.nextInt();
        
        System.out.print("Masukan nilai akhir: ");
        akhir = keyboard.nextInt();

        for (nilai = awal; nilai <= akhir; nilai ++)
        {
            if (nilai % 2 != 0)
            {
                System.out.print( "" + nilai);
            }
            System.out.print(" ");
        }   
    }
}
