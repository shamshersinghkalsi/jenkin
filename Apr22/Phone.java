package Apr22;
import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans;

        do {
            System.out.println("Press 1 for English");
            System.out.println("Press 2 for Hindi");
            System.out.println("Press 3 for French");
            System.out.println("Press 4 for Exit");

            ans = sc.nextInt();

            if (ans < 1 || ans > 4) {
                System.out.println("Enter number between 1 to 4");
            }

        } while (ans < 1 || ans > 4);

        if (ans == 1) {
            System.out.println("Press 1 for account balance in English");
            System.out.println("Press 2 for credit card in English");
            System.out.println("Press 3 to talk in English");
        } else if (ans == 2) {
            System.out.println("Press 1 for account balance in Hindi");
            System.out.println("Press 2 for credit card in Hindi");
            System.out.println("Press 3 to talk in Hindi");
        } else if (ans == 3) {
            System.out.println("Press 1 for account balance in French");
            System.out.println("Press 2 for credit card in French");
            System.out.println("Press 3 to talk in French");
        } else {
            System.out.println("Have a nice day");
        }


    }
}