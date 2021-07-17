package main.java.tasks.week6.homeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RunnerPerson {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Игорь", "Иван", "Николай", "Павел", "Михаил", "Дмитрий");
        List<String> surnames = Arrays.asList("Иванов", "Петров", "Сидоров", "Кузнецов", "Михальцов", "Сидорчик");
        String name = names.stream().findAny().toString();
        String surname = surnames.stream().findAny().toString();

        IntStream.rangeClosed(1, 10).boxed().map(i -> new Person( names.stream().findAny().toString(), surnames.stream().findAny().toString(), (int) (15 + Math.random() * 15))).peek(p -> p.toString()).forEach(System.out::println);

        //Stream.generate(() -> "a").limit(100).map(i -> new Person(name.stream().findAny().toString(), surname.stream().findAny().toString(), (int) (15 + Math.random() * 15))).peek(i -> i.toString()).forEach(System.out::println);


    }
}
