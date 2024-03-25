public class anjing {
    
    String jenis;
    int umur;
    String warna;
    
    public anjing(String jenis, int umur, String warna) {
        this.jenis = jenis;
        this.umur = umur;
        this.warna = warna;
    }
    
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public int getUmur() {
        if (umur < 2) {
         System.out.println("Eror !! Umur tidak boleh kurang dua tahun");
        }
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public String getWarna() {      
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
   
    void menggongong()
    {
        System.out.printf("'huhuhuheuhhuahaa'\n");
    }

    void makan()
    {
        System.out.printf("'nyamabayamnn'\n");

    }

    void tidur()
    {
        System.out.printf("'zzzZZ'\n");

    }

     public static void main(String[] args) {
         // anjing sample 1
        anjing anjing_1 = new anjing("Bulldog", 18, "Hitam");
         System.out.println("Halo, Anjing! Sample-1");
         System.out.println("Jenis: " + anjing_1.getJenis());
         System.out.println("Umur: " + anjing_1.getUmur());
         System.out.println("Warna: " + anjing_1.getWarna());
         
         System.out.println("anjing sample-1 sedang makan: " );
         anjing_1.makan();
         System.out.println("");
         
         // sample-2
        anjing anjing_2 = new anjing("Bulldog",20 , "abu-abu");
         System.out.println("Halo, Anjing! Sample-2");
         System.out.println("Jenis: " + anjing_2.getJenis());
         System.out.printf("Umur: " + anjing_2.getUmur() + "\n");
         System.out.println("Warna: " + anjing_2.getWarna());
         
         System.out.println("anjing sample-1 sedang tidur: " );
         anjing_1.tidur();
         System.out.println("");
     }
}
