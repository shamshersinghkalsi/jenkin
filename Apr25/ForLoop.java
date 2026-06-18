package Apr25;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }
        {
            Scanner a = new Scanner(System.in);
            int b = a.nextInt();


            for (int c = 1; c<=10 ; c++) {
                System.out.println(b + "*" +c+"="+b*c );

            }
        }
    }}