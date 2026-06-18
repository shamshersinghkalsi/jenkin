package May19;

public class EmployeeMain {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.work();
        dev.writecode();

        Manager man = new Manager();
        man.manageteam();
    }
}
