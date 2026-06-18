package Jun13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Cherry");
        fruits.add("banana");
        fruits.add("pINapple");
        fruits.add(1, "grape");
        fruits.removeLast();
        fruits.set(1, "grape");
        // fruits.remove("grape");
        System.out.println(fruits.indexOf("grape"));
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());
        System.out.println(fruits.contains("grape"));
        System.out.println(fruits);
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));

        }
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            if ("Cherry".equalsIgnoreCase(it.next())) {
                it.remove();
                System.out.println(fruits);
            }

        }
    }
}