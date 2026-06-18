package May12;

public class Main {
    static {
        System.out.println("ststic block executed");
    }
    {
        System.out.println("instance block is created");
    }
    public Main() {
        System.out.println("constructor called");
    }
    public static void main(String[] args) {
        Main main = new Main();

    }
}
