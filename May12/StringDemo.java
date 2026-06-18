package May12;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                String s = sc.next();
                String r = "";
                int v = 0;

                for (int i = 0; i < s.length(); i++){

                    r = s.charAt(i) + r;
                }
                System.out.println(r);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u'){
                v++;
            }
        }
        System.out.println("total number of vowels are " + v);
if  (s.compareTo(r) == 0) {
    System.out.println("string is palindrom");
}
else {
    System.out.println(" not a palindrom");
}
        }
    }

