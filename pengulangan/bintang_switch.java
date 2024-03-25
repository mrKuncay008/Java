import java.util.Scanner;

public class bintang_switch {

	public static void main(String[] args) {
		
		int segi;
		Scanner keyboard = new Scanner(System.in);

		System.out.println(" -------- Segitga Bintang* -------");

		System.out.println(" 1) Sama kaki");
		System.out.println(" 2) Sama kaki terbalik");
		System.out.println(" 3) Sama setengah");
		System.out.println(" 4) belah ketupat");

		System.out.println("Masukan Pilihan");
		segi = keyboard.nextInt();

		switch(segi) {

		case 1:
			segi = 10;
			for (int i = 1; i <= segi; i++ ) 
			{
				
				for (int x = i; x < segi; x++) 
						
						System.out.print(" ");

				for (int y = 1; y <= i; y++)
				
					System.out.print("* ");
					System.out.print("\n");

			} break;

		case 2:
		segi = 10;
			for (int i = segi; i >= 1; i-- ) 
			{
				
				for (int x = i; x < segi; x++) 
						
					System.out.print(" ");

				for (int y = 1; y <= i; y++)
				
					System.out.print("* ");
					System.out.print("\n");
	
			} break;
		case 3:
		segi = 10;
        for (int i = 1; i <= segi; ++i)
        {
            for (int x = 1; x <= i; ++x)

            System.out.print("* ");
        	System.out.print("\n");
        
        }break;

    case 4:
    	int c = 5/2;
    	segi = 5;

    		for (int i = 1; i <= c; i++) 
    		{
    			
    			for(int f = c; f > i; f++) {
    				System.out.print(" ");
    			}

    			for(int j = 1; j <= segi; j++) {
    				System.out.print("*");
    			}
    			
    			segi += 2;
    			System.out.print("\n");
    		}

    	 	   segi -= 4;
               for(int i = (c-1); i >= 1; i--) {

                       for ( int f = i; f <= (c-1); f++) {

                              System.out.print(" ");
                       }
                       for( int j = segi; j >= 1; j--) {

                              System.out.print("*");
                       }
                               segi -= 2;
                              System.out.print("\n");

        		}break;
			}
				System.out.println(" Program finised!!! ....");
		}
	}