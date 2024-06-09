/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan10;

public class savingAccont {
    public String name;
    public double balance;
    public String gender;
    
    public void deposit (int x) {
       balance += x; 
    }
    public void dataNasbah() {
        System.out.println("Nama: "+ name);
        System.out.println("Jenis Kelamin: "+ gender);
        System.out.println("Jumlah Deposit: "+ balance);
    }
}
