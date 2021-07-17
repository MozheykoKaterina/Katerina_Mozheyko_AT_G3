package main.java.tasks.week5.homeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Butterflies {

    public static void main(String[] args) {

        List<String> butterflies = Arrays.asList("Common blue", "Swallowtail", "Aglais io", "Common blue");

        System.out.println(butterflies.stream().map(x -> "\"" + x + "\"").collect(Collectors.toList()));

        System.out.println(butterflies.stream().filter(x -> x.contains("o")).collect(Collectors.toList()).stream().count());

        butterflies.stream().map(x -> x + " ").forEach(System.out::print);

        butterflies.stream().map(x -> x + " ").forEach(System.out::println);
    }
}