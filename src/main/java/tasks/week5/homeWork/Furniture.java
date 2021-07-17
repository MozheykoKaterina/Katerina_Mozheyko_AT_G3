package main.java.tasks.week5.homeWork;

import main.java.tasks.week5.homeWork.fields.Chair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Furniture {

    public static void main(String[] args) {

        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4));

        furniture.stream().map(x -> (x.getHeight() * x.getWidth())).forEach(System.out::println);

        Map<Integer, Chair> chair = new HashMap<Integer, Chair>();
        for (int i = 0; i < 3; i++) {
            chair.put(i, furniture.get(i));
            System.out.println(i + " " + furniture.get(i));
        }

        for (int a : chair.keySet()) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (Chair a : chair.values()) {
            System.out.println(a + " ");
        }

        System.out.println();

        for (Map.Entry<Integer, Chair> entry : chair.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " ");
        }
    }
}