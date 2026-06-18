package May09;

public class Student {
    public static void main(String[] args) {
        int[][] s = {{85,98,78,88},
                    {88,96,85,96},
                    {89,68,78,99}};
        for (int i = 0; i < s.length; i++) {
            int high = 0;
            for (int j = 0; j < s[i].length; j++) {
                if ( s[i][j] > high )
                    high = s[i][j];
                }
            System.out.println(" highest scote is " + high);
            //System.out.println();
            }
        for (int i = 0; i < 4; i++) {
            int avg = 0;
            for (int j = 0; j <s.length; j++) {
               avg += s[j][i];
            }
            System.out.println("average marks per subject is " + avg/3 );

        }int sum1 = 0;
        for (int i = 0; i < s.length; i++) {
            int sum =0;
            for (int j = 0; j < s[i].length; j++) {
                sum += s[i][j];
            }
            System.out.println(" total marks per student" + sum);
            if (sum > sum1);
            sum1 = sum;
            System.out.println(sum1);


        }

        }
    }

