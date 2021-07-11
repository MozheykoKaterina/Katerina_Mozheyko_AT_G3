package main.java.tasks.week5.homeWork;

import java.util.*;

public class Car {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Мерсы", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));

        for (int i = 0; i < cars.size(); i++) {
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