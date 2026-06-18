package June06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int a = sc.nextInt();
       Driving driving = new Driving();
        try {
            driving.drivingage(a);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
