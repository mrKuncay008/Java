/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

public class TestFindmax {
    // Main Method
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        int k = findMax(i, j);
        
        System.out.println(" The Maximum Between " + i + " dan " + j + " adalah " + k);
    }

    public static int findMax(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}
