package cpp;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, M;
        System.out.println("Mausukan Input Sesuai yang di Soal: ");
        N = in.nextInt();
        M = in.nextInt();
        
    // Soal bilangan bulat
    // Input ABC
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++){
            ABC[i] = in.nextInt();
        }
        
        // Output
        int count = 0;
        for (int x = N; x <= M; x++){
            if (x % ABC[0] == 0 && x % ABC[1] != 0 && x % ABC[2] != 0){
                count ++;
            }else if(x % ABC[1] == 0 && x % ABC[0] != 0 && x % ABC[2] != 0){
                count ++;
            }else if(x % ABC[2] == 0 && x % ABC[0] != 0 && x % ABC[1] != 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
