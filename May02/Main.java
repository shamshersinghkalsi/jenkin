package May02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner grade = new Scanner(System.in);
        s.grade1 = grade.nextDouble();
        s.grade2 = grade.nextDouble();
        s.grade3 = grade.nextDouble();
        s.name = grade.next();
        System.out.println(s.getLetterGrade());
        s.printReport();
        System.out.println(s.getAverage());

    }
}
