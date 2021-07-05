package main.java.tasks.week5.classWork;

import java.util.ArrayList;
import java.util.List;

public class MyListSeven {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println();

        names.set(2, "Оля");
        names.set(4, "Катя");

        names.remove("Оля");
        names.remove(3);

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}

