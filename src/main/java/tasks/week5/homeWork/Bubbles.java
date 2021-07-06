package main.java.tasks.week5.homeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bubbles {

    public static void main(String[] args) {

        String[][] array = {{"CO2", "2"}, {"O2", "4"}, {"CO", "5"}};
        Map<String, Integer> bubbles = new HashMap<String, Integer>();
        bubbles.put("CO2", 2);
        bubbles.put("O2", 4);
        bubbles.put("CO", 5);

        for (String bubble : bubbles.keySet()) {
            System.out.print(bubble + " ");
        }
        System.out.println();

        for (int bubble : bubbles.values()) {
            System.out.print(bubble + " ");
        }
        System.out.println();
    }
}