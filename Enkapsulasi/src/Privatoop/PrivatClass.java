/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Privatoop;

/**
 *
 * @author kunca
 */
public class PrivatClass {
    private  int alpha; // private class
    public int beta; // public class
    
    int gamma; // default

    void setAlpha (int a) {
        alpha = a;
    }
    int getAlpha(){
        if (alpha < 2) {
            System.out.printf("Angka Alpha tidak boleh kurang dari 2 ");
        }
        return alpha;
    }
}
