package Apr18;

public class IfElse {
    public static void main(String[] args) {
        int x = 100;

        if( x % 2 == 0){
            System.out.println("it is even");
        } else {
            System.out.println("it is odd");
        }
        boolean heavyraining = true;
        boolean raining = true;
        boolean sunny = false;
        if (raining) {
            if (heavyraining) {
                System.out.println(" i will wear rain coat");
            } else {
                System.out.println("i will take umberella");
            }
        }else if (sunny) {
            System.out.println(" i will wear shades");
        } else {
            System.out.println(" i will stay at home");
        }

    }

    }

