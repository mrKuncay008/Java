package Oracle01;

import java.io.Console;
public class ValidatePin {

    public static void main(String[] args) {
      String validPin = "66445533";
      Console con = System.console();

      if (con == null) {
        System.out.print("No console available");
        return;
      }
      String pin;
      boolean pinCorrect = false;

      do {
        System.out.print("Enter your Pin: ");
        char[] pinChar = con.readPassword();
        pin = new String(pinChar);

        if (pin.equals(validPin)) {
          pinCorrect = true;
        } else {
          System.out.println("a Pin Incorrect !! Try Again \n");
        }
      } while (!pinCorrect);
      System.out.println(" Pin Correct");
      System.out.println(" Thanks !!");
    }
}
