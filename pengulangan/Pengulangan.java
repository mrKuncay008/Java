package pengulangan;
import java.util.Scanner;
/**
 *
 * @author mrkuncay
 */
public class Pengulangan {
    public static void main(String[] args) {
        
        int i, a, x;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan jumlah; ");
        i = keyboard.nextInt();
        
        for (x = i; x >= 1; x--);
        {
            for (a = x; a < i; a++);
            System.out.println("*");
        }
    }
    
}
