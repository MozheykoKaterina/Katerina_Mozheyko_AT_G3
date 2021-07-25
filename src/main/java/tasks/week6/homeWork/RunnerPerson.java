package main.java.tasks.week6.homeWork;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RunnerPerson {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10).boxed().map(i -> new Person()).filter(x -> x.age < 21).map(x -> x.name + " " + x.surname + " " + x.age).sorted().limit(4).collect(Collectors.toList()).forEach(System.out::println);

    }
}
