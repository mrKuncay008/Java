/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matkul.oop; // Nama packed

import java.util.Scanner;

public class MatkulOop { // Nama class
    private double jj; // jj atau jari jari adalah varibel 
    
    public MatkulOop(double jj) {
        this.jj = jj;
    }
    
    public double Luas() {
        return Math.PI * jj * jj;
    }
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Masukan Nilai: ");
        double jarijari = input.nextDouble();
        MatkulOop Lingkar = new MatkulOop(jarijari);
        double Luas = Lingkar.Luas();
        System.out.printf("Luas lingkaran dengan jari-jari " + jarijari + " adalah: %.2f\n", Luas);
    }
    
}
/* 
Luas lingkaran dengan jari-jari 10 adalah: 314.16
atau
  Luas lingkaran dengan jari-jari 10 adalah: 
    314.1592653589793
 */