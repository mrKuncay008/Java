/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author kunca
 */
public class pegawai {
     String id;
    String nama;

    public float income() {
        float gaji = 500000;
        return gaji;
    }
    public void tampilkan (){
        System.out.println("id: \t" + id);
        System.out.println("nama: \t" + nama);
        System.out.println("Gaji \t: " + income());
        System.out.println("");
    }
}
