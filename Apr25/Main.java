package Apr25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
switch (b) {
    case 1 :
        System.out.println("it is one");
        break;
    case 10:
        System.out.println("it is ten");
        break;
    default:
        System.out.println("nothing found");
}
switch (b) {
    case 1 -> System.out.println(1);
    case 10 -> System.out.println(10);
}

}

    }

