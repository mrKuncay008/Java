public class abjact {
    
    // by mr kuncay
       public static void main(String[] args) {
         char i, j;
          
           for(i = 'A'; i <= 'M'; i--);
           {  
              for(j = 'A'; j <= 'M'; j++);
              {
                  if (j < i) 
                    
                     System.out.print(" " + j);
                   else
                  
                      System.out.print(" " + i);
                  
              }
           }
    	System.out.println("\n");
       }
    
}
