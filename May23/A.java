package May23;

public class A {
    A() {
       super();
        System.out.println("Class A called");
    }
    A(int x){
        this();
        System.out.println(x);
    }
    void show(){
        System.out.println("In class A");
    }
}

class B extends A {
    B() {
        super(2);
        System.out.println("Class B called");
    }
    B(int x ){
        this();
        System.out.println(x);
    }
}

class AMain {
    public static void main(String[] args) {
        B b = new B(10);
    }
}
