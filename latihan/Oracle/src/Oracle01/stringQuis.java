package Oracle01;
import java.util.Scanner;
/**
 *
 * @author kunca
 */
public class stringQuis {
    
    public Scanner inputName = new Scanner(System.in);
    private String greeting = "You name is ";
    String name;
    public String getInputName(String prompt) {
        System.out.print(prompt);
        return inputName.nextLine();
    }
    public void displayMain() {
        name = getInputName("Input your name: ");
        System.out.println(greeting + name);
    }
}
