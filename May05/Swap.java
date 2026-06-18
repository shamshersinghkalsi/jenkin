package May05;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a = 20;
        int b = 30;
        int c ;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
