package uts.pbo.Frendi1049;

public class Pembayaran {
    Pasien pasien;
    Dokter dokter;
    int administrasi;
    int kartuBerobat;
    int Tindakan;
    public Pembayaran(Pasien pasien, Dokter dokter, int administrasi, int kartuBerobat, int Tindakan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.administrasi = administrasi;
        this.kartuBerobat = kartuBerobat;
        this.Tindakan = Tindakan;
    }
    public void tampilInformasiPembayaran() {
        int totalBiaya = administrasi + kartuBerobat - dokter.tarif;
        if (Tindakan == 200000) {
            totalBiaya += Tindakan;
        }
        System.out.println("\n=== Informasi Pembayaran ===");
        System.out.println("Data Pasien:");
        System.out.println("Kode Pasien: " + pasien.kodePasien);
        System.out.println("Nama: " + pasien.namaPasien);
        System.out.println("Email: " + pasien.emailPasien);
        System.out.println("Dokter: " + dokter.jenis);
        System.out.println("Rincian Biaya:");
        System.out.println("- Administrasi: Rp. " + administrasi);
        System.out.println("- Kartu Berobat: Rp. " +  kartuBerobat);
        if (Tindakan > 0) {
            System.out.println("- Tindakan: Rp. " + Tindakan);
        }
        System.out.println("Total Biaya: Rp. " + totalBiaya);
    }
}
