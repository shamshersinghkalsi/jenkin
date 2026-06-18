package May19;

public class Main {
    public static void main(String[] args) {
           //int a = 10;
             // int b = 10;

           //String d = new String("hello");
        String s = "hello";
        StringBuffer c = new StringBuffer("hello");
        for (int i = 0 ; i < 100 ; i++) {
            c = c.append(i);

        }
        {
            System.out.println(c);
        }
    }
}
