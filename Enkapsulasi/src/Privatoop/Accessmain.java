/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Privatoop;
import java.util.Scanner;
/**
 *
 * @author kunca
 */
public class Accessmain {
    public static void main(String[] args) {
        PrivatClass a = new PrivatClass();
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Masukan Nilai Alpha: ");
        a.setAlpha(input.nextInt());
        System.out.println("Nilai Alpha Adalah: " +a.getAlpha() + "\n");
        
        System.out.printf("Masukan Nilai Beta: ");
        a.beta = input.nextInt();
        System.out.println("Nilai Beta Adalah: " + a.beta + "\n");
        
        System.out.printf("Masukan Nilai Gamma: ");
        a.gamma = input.nextInt();
        System.out.println("Nilai gamma Adalah: " + a.gamma + "\n");
    }
}
