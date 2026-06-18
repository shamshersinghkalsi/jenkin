package Apr25;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int m=0;
        int s = l.nextInt();
        while (s >0) {
            m = m + s % 10;
            s = s / 10;


        }
        System.out.println(m);


    }
}
