package May12;

public class Demo {
    int x = 10;

    public Demo(){
        System.out.println(x);
        x++;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.x);
        System.out.println(demo.x);
    }
}
