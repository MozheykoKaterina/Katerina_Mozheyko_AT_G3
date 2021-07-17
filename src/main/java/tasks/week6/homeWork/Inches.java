package main.java.tasks.week6.homeWork;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Inches {

    public static void main(String[] args) {

        System.out.println(IntStream.rangeClosed(1, 20).boxed().filter(x -> x % 2 == 0).map(x -> x * 2.54).collect(Collectors.toList()).stream().reduce((x, y) -> x + y).get());
    }
}
