package main.java.tasks.week5.homeWork;

import java.util.Arrays;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Москва", "Минск", "Берлин");

        System.out.println(cities.stream().flatMap(x -> Arrays.stream(x.split(""))).count());

        cities.stream().map(x -> x + " ").forEach(System.out::print);
    }
}