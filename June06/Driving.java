package June06;

public class Driving {
    public void drivingage( int age){
        if (age<18){
            throw new RuntimeException(" minimum age is 18");
        }
        else {
            System.out.println("driving test booked");
        }
    }

}
