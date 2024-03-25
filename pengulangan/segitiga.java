
import java.util.Scanner; // libary scanner

class segitiga {

	// Segitiga samakaki by Mr-kuncay

	public static void main(String[] args) {

		int baris, x, i, y;

		Scanner input = new Scanner(System.in);
		System.out.print("Masukan jumlah: ");
		baris = input.nextInt();

		for(i = 1; i <= baris; i++) {

			for(x = i; x < baris; x++)
				System.out.print(" ");
			for(y = 1; y <= i; y++)
				System.out.print("* ");
				System.out.print("\n");
		}
	 }
   }
