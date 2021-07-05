package main.java.tasks.week5.homeWork;

import java.util.*;

public class Car {

    public static void main(String[] args) {

        List<String> cars = new LinkedList<>();
        cars.add("Мерсы");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");


        for (int i = 0; i < 4; i++) {
            if (cars.get(i) != null) {
                if (cars.get(i).length() > 4) {
                    cars.remove(i);
                    i = i - 1;
                } else {
                    System.out.print(cars.get(i) + " ");
                }
            }
        }
    }
}