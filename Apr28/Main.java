package Apr28;

public class Main {
    public static void main(String[] args) {
            Dog dog = new Dog();
            dog.breed = "Bull Dog";
            dog.age = 4;
            dog.gender = "male";
            dog.color = "black";
            dog.bark();

        System.out.println(dog.breed);
        System.out.println(dog.age);
        System.out.println(dog.gender);
        System.out.println(dog.color);
        Dog dog1 = new Dog();
        dog1.breed = "Kangal";
        dog1.age = 7;
        dog1.gender = "female";
        dog1.color = "white";
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);
        System.out.println(dog1.color);
    }
}
