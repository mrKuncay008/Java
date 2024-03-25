import java.util.Scanner;
public class sepatu {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int uang, vans, convers;

        vans = 50000;
        convers= 30000;

        System.out.print("Si Mansur membawa uang ");
            uang = keyboard.nextInt();
        System.out.println();
            if (uang > vans)
            {
                System.out.print(" yeayy masnyur belii Vans !!");
                System.out.println();
            }
            else if (uang >= convers)
            {
                System.out.print(" gpp lah beli conver hueheuheuh");
                System.out.println();
            }
            else {
                System.out.print(" Balik aja lah asu gk ada duit \n");
            }
    }
}
