package June02;

public class Array {
    public static void main(String[] args) {

      try {
          int[] arr = {10, 15, 17, 18, 42};
        System.out.println(arr[6]);
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println(e.getMessage());
      }
      }
}
