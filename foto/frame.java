import java.awt.GridLayout;
import javax.swing.JFrame;
import java.awt.Color;

public class frame extends JFrame{
    foto s;
   
    public  frame() {
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setResizable(false);
        setTitle("Graphics");
        init ();
    }

    public void init() {
        setLocationRelativeTo (null);
        setLayout(new GridLayout(1, 1, 0, 0));
        
        s = new foto();
        add(s);

        setVisible(true);
    }

    public static void main(String[] args) {

        new frame();
    } 
}
