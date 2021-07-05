package main.java.tasks.week5.classWork;

import java.util.ArrayList;
import java.util.List;

public class MyListNine {

    public static void main(String[] args) {

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }

        System.out.println();

        int count = 0;
        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                count++;
            };
        }
        System.out.println(count);

        for (int i = 0; i < 5; i++) {
            System.out.print(vegetables.get(i) + " ");
        }

        System.out.println();

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
    }
}