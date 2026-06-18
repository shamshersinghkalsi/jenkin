package May05;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 26;
        arr[2] = 38;
        arr[3] = 40;
        arr[4] = 5;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        int[] arr1 = {12,42,35,44,5};
        System.out.println(arr1[0]);
        for (int i = 0; i < 5; i++) {
         //   System.out.println(arr[i]);
           // for (int j = 0; j < arr1.length; j++) {
             //   System.out.println(arr1[j]);

            }
            for (int a : arr1){
                System.out.println(a);

        }
    }
}
