package June16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> cities = new ArrayList<>();
//        cities.add("Tokyo");
//        cities.add("Tokyo");
//        cities.add("Toronto");
//        cities.add("Vancover");
//        List<String> countries = new ArrayList<>();
//        countries.add("Japan");
//        countries.add("Canada");
//        countries.add("India");
//        cities.addAll(1,countries);
//        System.out.println(cities);
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.get(3));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

        }
    }
}
