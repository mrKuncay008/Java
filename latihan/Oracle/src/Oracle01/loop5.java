package Oracle01;

import java.util.Scanner;
public class loop5 {
    public static void main(String[] args) {
        int i;
        int N = 5;
        int total = 0;
        Scanner in = new Scanner(System.in);
//        System.out.println("Hitung mundur: ");
//        for ( i = 100; i > 0; i--) {
//            System.out.println(i);      
//        }
//        System.out.println("Terbang !!");
//        System.out.println("====================================================");
//        for (int a = 1; a < 5; a++) {
//            System.out.println("Hallo");
//        }
//        System.out.println("====================================================");
//        for (int b = 1; b < 10; b++) {
//            System.out.println("jumlah: " + b * b);
//        }
        System.out.println("====================================================");
        System.out.println("Program Ini menambah Nilai: " + N + " Angka");
        
        for (int j = 0; j <= N; j++) {
            System.out.print("Masukan Angka: ");
            int value = in.nextInt();
            total += value; 
        }
        System.out.println("Total nya Adalah: " + total + ".");
    }
}
