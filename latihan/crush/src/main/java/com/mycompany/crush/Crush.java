package com.mycompany.crush;

/**
 *
 * @author kunca
 */
import java.util.Scanner;
public class Crush {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       
        System.out.print("\t\tSiapa nama Kamu? ");
        String nama = input.nextLine(); // ini adalah fungsi untuk input dan string
        
        System.out.print("\t\tSiapa nama crush mu? ");
        String crush = input.nextLine();
        
        System.out.println("");
        
        System.out.print("\t\t Owalahh " + nama + "Love " + crush + "!!\n");
        System.out.print("\t\tSemoga cepat jadiann yahhh\n");
        
        System.out.print("\t\tTapii Sebentarr\n");
        
        System.out.print("\t\tApakaah Kamu ada rasa ama " + crush + "? ");
        String x = input.nextLine();
        
        if ("yes".equals(x)) {
            System.out.print("Gemoooyyy " + crush + " Suka Juga sama " + nama + "\n");
        }
        else if ("no".equals(x)){
            System.out.print(" HUHEUHEUHEUHEUE " + crush + " Tidak Sukaaa hiyaaa \n");
        }
    }
}
