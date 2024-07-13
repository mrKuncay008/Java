package Oracle01;
import java.util.Scanner;

public class BreakCont {
    // public static void main(String[] args) {
    //     int i;
    //     System.out.println("launchh !!");
    //     for(i = 100; i > 0; --i) {
    //         if (i == 85 || i == 84 || i == 83 || i == 82) {
    //             continue;
    //         }
    //         else if(i == 70) {
    //             break;
    //         }
    //         System.out.println(i);
    //     }
    //     System.out.println("Cutdown cut off !!!");
    // }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int numInput = 10, input = 0;

      for (int i = 0; i < numInput; i++ ) {
        System.out.print("Masukan Input : ");
        input = in.nextInt();

        if (input % 2 == 0) {
          continue;
        }
        else if (input % 1 == 0) {
            System.out.println("The Number Ganjil: ");
            break;
        }
      }
    }
}
