package June02;

public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.toUpperCase());
        } catch (NullPointerException e){
            System.out.println("arithmetic exception");
        } finally {
            System.out.println("Finally block exceuted");
        }


      //  int a = 10/0;
      //  System.out.println(a);

    }
}
