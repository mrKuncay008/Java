package Modul06;

import java.util.Scanner;

public class bool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean drivingAge;
        drivingAge = false;
        System.out.print("Masukan umur: ");
        
        int age = input.nextInt();
        
        if (age <= 18) {
            System.out.println("Nice");
        }
        else {
            System.out.println("Jancook");
        }
    }
}
