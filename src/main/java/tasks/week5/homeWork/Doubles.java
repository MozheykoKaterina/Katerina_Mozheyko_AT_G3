package main.java.tasks.week5.homeWork;

import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        doubles.stream().map(x -> x + " ").forEach(System.out::print);

        System.out.println();

        System.out.println(doubles.stream().reduce((x, y) -> x * y).get());

        System.out.println(doubles.stream().map(x -> Math.ceil(x) - x).reduce((x, y) -> x + y).get());

        doubles.stream().map(Double::intValue).map(x -> x + " ").forEach(System.out::print);

        System.out.println();
    }
}