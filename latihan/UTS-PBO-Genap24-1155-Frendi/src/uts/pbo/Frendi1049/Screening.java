
package uts.pbo.Frendi1049;

public class Screening {
    boolean batukPilek;
    boolean demam;
    
    public Screening (boolean batukPilek, boolean demam) {
        this.batukPilek = batukPilek;
        this.demam = demam;
    }
    // Method Menentukan Apakah Terdeteksi covid atau tidak
    public boolean teridikasiCovid() {
        return batukPilek && demam;
    }
}
