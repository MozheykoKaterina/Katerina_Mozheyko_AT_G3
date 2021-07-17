package main.java.tasks.week5.homeWork.fields;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandBox {

    public static void main(String[] args) {

        List<Sand> sand = Arrays.asList(
                new Sand(2, "Речной"),
                new Sand(4, "Речной"),
                new Sand(2, "Карьерный"),
                new Sand(7, "Речной"));

        sand.stream().map(x -> x.weight + " ").forEach(System.out::print);

        System.out.println();

        sand.stream().map(x -> x.name + " ").forEach(System.out::print);

        System.out.println();

        Map<Integer, Sand> sandMap = new HashMap<Integer, Sand>();
        for (int i = 0; i < 4; i++) {
            sandMap.put(i, sand.get(i));
            System.out.println(i + " " + sand.get(i));
        }

        for (int a : sandMap.keySet()) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (Sand a : sandMap.values()) {
            System.out.println(a + " ");
        }

        System.out.println();

        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " ");
        }
    }
}