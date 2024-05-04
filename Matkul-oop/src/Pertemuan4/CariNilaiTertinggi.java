package Pertemuan4;

public class CariNilaiTertinggi {
    public static void main(String[] args) {
        NilaiTertinggi k = new NilaiTertinggi();
        k.i = 15;
        k.j = 20;
        System.out.println(" The Maximum Between " + k.i + " dan " + k.j + " adalah " + k.findMax(k.i, k.j));

    }
}
