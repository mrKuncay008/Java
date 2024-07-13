package java_opp;
/**
 *
 * @author mrkuncay
 */
public class NewPlayer {
    String nama;
    int speed;
    int healtPoin;
    
    // definisi metode lari
    void lari() 
    {
        System.out.println(nama + "Sedang Larii...");
        System.out.println("Kecepatan: " + speed);
    }
    
    boolean isDead()
    {
        if(healtPoin <= 0)
            return true;
        return false;
    }
}

