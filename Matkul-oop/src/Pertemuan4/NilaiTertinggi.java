
package Pertemuan4;

public class NilaiTertinggi {

    int i;
    int j;

    public static int findMax(int i, int j) {
        int result;
        if (i > j) {
            result = i;
        } else {
            result = j;
        }
        return result;
   
    }
}
