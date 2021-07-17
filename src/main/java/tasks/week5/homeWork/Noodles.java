package main.java.tasks.week5.homeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Noodles {

    public static void main(String[] args) {

        List<String> noodles = Arrays.asList("Hakka", "Ramen", "Hibachi", "Schezwan");

        noodles.stream().map(x -> x + " ").forEach(System.out::print);

        System.out.println();

        System.out.print(noodles.stream().map(x -> x.replaceAll("a", "o")).collect(Collectors.toList()));
    }
}
