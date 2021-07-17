package main.java.tasks.week5.homeWork;

import java.util.*;
import java.util.stream.Collectors;

public class Car {

    public static void main(String[] args) {

        List<String> cars = Arrays.asList("Мерсы", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");

        cars.stream().map(x -> "\"" + x + "\"").forEach(System.out::println);

        System.out.println(cars.stream().filter(x -> x.length() > 4).collect(Collectors.toList()));
    }
}