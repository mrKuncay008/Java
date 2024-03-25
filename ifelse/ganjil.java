import java.util.Scanner; // liabry untuk scan input
class ganjil { // public class nama file
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); // variable perintah untuk menampilkan scan input

		int awal, akhir, nilai; // variable int
		
		System.out.println("---------- bulangan ganjil ------------");
		System.out.println(" Masukan nilai: ");
		awal=input.nextInt(); // input
		System.out.println("masukan nilai akhir: ");
		akhir=input.nextInt(); // input

		for (nilai=awal; nilai<=akhir; nilai++ ) {  // int dan wihle (forwhile)
			if(nilai % 2!= 0){ // proses jika 
				System.out.print(nilai+" "); // print untuk sebarih, println untuk garis kebawah
			} 
		}

	}
}