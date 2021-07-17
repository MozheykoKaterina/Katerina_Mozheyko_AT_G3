package main.java.tasks.week5.homeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Андора", "Португалия", "Англия", "Замбия");

        countries.stream().map(x -> x + ", ").forEach(System.out::print);

        System.out.println();

        System.out.println(countries.stream().filter(x -> x.length() < 7).count());

        System.out.println(countries.stream().filter(x -> x.length() < 7).collect(Collectors.toList()));
    }
}