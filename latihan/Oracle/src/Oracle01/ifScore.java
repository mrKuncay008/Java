package Oracle01;


public class ifScore {
    public static void main(String[] args) {
        int numberGoals = 1;
        String S;
        
        if (numberGoals < 2) {
            S = "goal";
        } else{
            S = "goals";
        }
        System.out.println("I scored " + numberGoals + " " + S);
    }
}
