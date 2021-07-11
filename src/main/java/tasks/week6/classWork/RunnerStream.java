package main.java.tasks.week6.classWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunnerStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "чисто", "мыла", "мама");
        System.out.println(list.stream().filter(x -> x.equals("мама")).count());
        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter(x -> x.equals("мама")).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println(list.stream().skip(2).limit(2).toArray());
        System.out.println(list.stream().distinct().filter(x -> x.contains("м")).collect(Collectors.toList()));
    }
}