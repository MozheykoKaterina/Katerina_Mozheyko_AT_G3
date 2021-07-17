package main.java.tasks.week6.homeWork;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListNumber {

    public static void main(String[] args) {

        Random random = new Random();
        Stream.generate(() -> random.nextInt(50)).limit(10).filter(x -> x % 3 == 0).filter(x -> x % 5 == 0).forEach(System.out::println);
    }
}