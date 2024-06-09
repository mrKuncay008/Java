
package Pertemuan09;

import javax.swing.JOptionPane;

public class eventOod {
    public static void main(String[] args) {
        String numStr, result;
        int num, again;
        do {
            numStr = JOptionPane.showInputDialog("Maukan intreger = ");
            num = Integer.parseInt(numStr);
            result = "anda memasukan bilangan: " + ((num%2 == 0) ? "Genap" : "Ganjil"); // ekspresi kondisi Ternery
            JOptionPane.showMessageDialog(null, result);
            
            again = JOptionPane.showConfirmDialog(null, "ada Lagi ?");
        } 
        while (again == JOptionPane.YES_OPTION);
    }
}
