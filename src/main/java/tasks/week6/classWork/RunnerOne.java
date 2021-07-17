package main.java.tasks.week6.classWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunnerOne {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "чисто", "мыла", "мама");
        System.out.println(list.stream().anyMatch(x -> x.equals("мама")));
        System.out.println(list.stream().allMatch(x -> x.contains("м")));
        System.out.println(list.stream().map(x -> x + "м").collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(x -> Arrays.stream(x.split("а"))).filter(x -> !x.equals("")).collect(Collectors.toList()));

    }
}