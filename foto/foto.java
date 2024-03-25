
 import java.awt.Graphics;
 import java.awt.image.BufferedImage;
 import java.io.File;
 import java.io.IOException;
 import java.nio.Buffer;
 
 import javax.imageio.ImageIO;
 import javax.swing.JPanel;
 
 public class foto extends JPanel{
 
     private BufferedImage image;
     public foto(){
         try {
             image = ImageIO.read(getClass().getResourceAsStream("kucing.png"));
         } catch (Exception e) {
             e.printStackTrace();
         }
         repaint();
     }
 
     public void paint(Graphics g){
      // ukuran normal
      g.drawImage (image, 10, 10, null);
      // gambar dengan separuh ukuran
      g.drawImage (image, 350, 10, image.getWidth() /2, image.getHeight() /2, null);
      // gambar dengan 1/5 ukuran
      g.drawImage (image, 550, 10, image.getWidth() /5, image.getHeight() /5, null);
      // gambar denagn tinggi 1/2 dr ukuran awal dan lebar 1,5 kali
      g.drawImage (image, 270, 220, 2 * image.getWidth(), image.getHeight() /2, null);   
     }
 }
     