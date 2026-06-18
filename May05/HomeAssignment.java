package May05;

public class HomeAssignment {
    public static void main(String[] args) {
        int[] n = {10,23,4,5,65,345,27};
        int sum =0;
        int max = 0;
        int min = 0;
        for (int j = 0; j < n.length; j++ ) {
            if (n[j] > max) {
                min = max;
                max = n[j];

            }}
            System.out.println("maximum number " + max);

                for (int j = 0; j < n.length; j++ ) {
                    if (n[j] < min) {
                min = n[j];}}
                    System.out.println(" minimum number " + min );


        System.out.print(" even ");
for (int s = 0; s < n.length; s++ ){
     if  (n[s]% 2 == 0){
        System.out.print(n[s] + "  ");}}
        System.out.println(" ");
        System.out.print(" odd ");

        for (int s = 0; s < n.length; s++ ){
            if  (n[s]% 2 != 0){
                System.out.print(n[s] + "  ");}}
        System.out.println(" ");

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }

            }
            System.out.print(n[i] + " ");
        }
        System.out.println(" ascending order ");

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] < n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
            System.out.print(n[i] + " ");}
        System.out.println(" descending order ");

        for (int i = 0; i < n.length; i++ ){
        sum += n[i];}
        System.out.println(" sum of array " + sum);
    }

}