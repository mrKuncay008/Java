
package Pertemuan09;
// hal 5
public class materiForsum {
    public static void main(String[] args) {
        int total = 0;
        for(int number = 2; number <= 10; number  += 2) {
            total += number;
        }
        System.out.printf("Sum is %d \n" , total);
    }
}