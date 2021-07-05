package main.java.tasks.week5.classWork;

import java.util.HashMap;
import java.util.Map;

public class MyListFive {

    public static void main(String[] args) {

        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> words = new HashMap<Integer, String>();

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
            System.out.print(i + " " + array[i] + " ");
        }

        System.out.println();

        for (int a : words.keySet()) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (String a : words.values()) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + " ");
        }
    }
}