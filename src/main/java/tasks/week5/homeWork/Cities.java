package main.java.tasks.week5.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Москва");
        cities.add("Минск");
        cities.add("Берлин");

        int count = 0;
        for (String city : cities) {
            count = count + city.length();
        }
        System.out.println(count);

        for (int i = 0; i < 3; i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}