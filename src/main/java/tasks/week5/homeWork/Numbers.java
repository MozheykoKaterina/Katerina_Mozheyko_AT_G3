package main.java.tasks.week5.homeWork;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        numbers.stream().forEach(System.out::println);

        System.out.print(numbers.stream().sorted().collect(Collectors.toList()));

        System.out.println();

        numbers.stream().map(x -> x + " ").forEach(System.out::print);

        System.out.println();

        System.out.println(numbers.stream().sorted((x, y) -> -x.compareTo(y)).collect(Collectors.toList()));
    }
}