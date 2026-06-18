package May09;

import java.util.Scanner;

public class May09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[2][2];
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 sum += arr[i][j];
            }
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            sum1 = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum1 += arr[i][j];
            }System.out.println(sum1);
            System.out.println();

        }
    }
}
