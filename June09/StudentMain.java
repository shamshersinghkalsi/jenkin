package June09;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
       Student<Students,Course> stu1 = new Student<>(new Students("Ram",2), new Course("bio"));
       Student<Students,Course> stu2 = new Student<>(new Students("Bal",5), new Course("phy"));
        System.out.println(stu1.toString());
        System.out.println(stu2);


    }
}
