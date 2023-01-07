import java.util.Scanner;

public class Try_catch_review_Marn {
/* The following is a *brief* review of try catch to continue to familiarize myself with VSCode and just doing a java
 * review. All code is my own except otherwise noted.
 * 
 * Copyleft, all wrongs reserved
 */
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);

        String check_one = null;
        int check_two = 0;

        System.out.println ("Welcome to Nick Marn's incredibly basic try-catch-finally program. Enter a sentence");
        try {
            check_one = checker.nextLine();
        }
        catch (Exception e) {
            return;
        }
        

    }

}