package June16;

import java.util.LinkedList;
import java.util.List;

public class Employee {
    int id;
    String name;
    double salary;


    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add( new Employee(123,"ram",12000));
        employees.add( new Employee(127,"sham",15000));
        employees.add( new Employee(128,"bam",11100));
        employees.add( new Employee(126,"pam",13000));
        double sal = 0;
        String n = null;
        for (Employee emp : employees){
            if (emp.salary > sal){
                sal = emp.salary;
                n = emp.name;

            }
        }
        System.out.println(n);
        System.out.println("higest salary is " + sal);
    }
}
