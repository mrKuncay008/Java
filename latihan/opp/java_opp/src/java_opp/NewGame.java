
package java_opp;

/**
 *
 * @author mrkuncay
 */
public class NewGame {
    public static void main(String[] args) {
        // object player
        NewPlayer kuncay = new NewPlayer();
        
        //mengisi atribut player
        kuncay.nama = "mrkuncay";
        kuncay.speed = 70;
        kuncay.healtPoin = 0;
        
        //menjalankan metode
        kuncay.lari();
        
        if(kuncay.isDead())
        {
            System.out.println("Game over");
        }
    }
}