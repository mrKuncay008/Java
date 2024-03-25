package com.mycompany.ganjil;

/**
 *
 * @author mrkuncay
 */
import java.util.Scanner; // libary input (Scanner)
public class Ganjil {

    public static void main(String[] args) {
        int pilih, nilai;
        Scanner input=new Scanner(System.in);
        
        System.out.println("---------- Bilangan ganjil dan genap java --------\n");
        
        System.out.print("Masukan Pilihan [1]Ganjil, [2]Genap: ");
        pilih=input.nextInt(); //input 1
        System.out.print("Masukan Nilai: ");
        nilai=input.nextInt(); // input 2
        
        if (pilih == 1) {
            
            System.out.print(" #### Ini adalah bilangan Ganjil ####\n"); 
            for (int i = 1; i < nilai; i++) {
                if (i % 2 !=0) {
                     System.out.print(i + " ");
                }
            }
        } else {
            System.out.println(" #### Ini adalah bilangan Genap ###");
            for (int i = 1; i < nilai; i++) {
                if (i % 2 !=1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
