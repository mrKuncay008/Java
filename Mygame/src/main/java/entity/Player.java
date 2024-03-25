
package entity;

import com.mycompany.mygame.GamePanel;
import com.mycompany.mygame.KeyHandler;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public final class Player extends entity{
    
    GamePanel gp;
    KeyHandler keyH;
    
    public Player(GamePanel gp, KeyHandler keyH) throws IOException {
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();
        
    }

    public Player(KeyHandler keyH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
        direction = "down";
    }
    public void getPlayerImage() {
        try {
            
            up1 = ImageIO.read(getClass().getResourceAsStream("/player/kuncayUp1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/player/kuncayUp2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/player/kuncayUp3.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/player/kuncayUp4.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/player/kuncayUp5.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/player/kuncayUp6.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/player/kuncayUp7.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/player/kuncayUp8.png"));
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void update(){
        
        if(keyH.upPressed == true) {
            direction = "up";
            y -= speed;
        }
        else if(keyH.downPressed == true) {
            direction = "down";
            y += speed;
        }
        else if(keyH.leftPressed == true) {
            direction = "left";
            x -= speed;
        }
        else if(keyH.rightpressed == true) {
            direction = "right";
            x += speed;
        }
    }

    /**
     *
     * @param g2
     */
    public void draw(Graphics2D g2) {
       
//        g2.setColor(Color.red );
//        g2.fillRect(x, y, gp.tileSize , gp.tileSize);
        BufferedImage image = null;
        switch (direction) {
            case "up" -> image = up1;
            
            case "down" -> image = down1;
            
            case "left" -> image = left1;
            
            case "right" -> image = right1;
          
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }

    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}