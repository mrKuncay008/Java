// hanoi
import java.util.Scanner;
public class hanoi {
	public static void () {
		
		Scanner keyboard = new Scanner(System.in);
		int jumlah, asal, tujuan;
		
		System.out.print("asal dari mana: ");
			asal = keyboard.nextInt();

		System.out.print("tujuan ke mana: ");
			tujuan = keyboard.nextInt(); 
		
		System.out.print("berapa jumlah: ");
			jumlah = keyboard.nextInt();
		
			if (jumlah >= 1) {
				
			System.out.println("pindah kan cakram 4 dari " + asal + " ke " + tujuan);
		}
		else {
			System.out.println("pindah kan cakram 4 dari " + asal + " ke "+ tujuan);
	
		}
	}
}

// MASIH ERROR !!