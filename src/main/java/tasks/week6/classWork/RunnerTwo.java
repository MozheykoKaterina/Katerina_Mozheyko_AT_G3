package main.java.tasks.week6.classWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RunnerTwo {

    public static void main(String[] args) {

        List<String> listString = Arrays.asList("мама", "мыла", "раму", "чисто", "мыла", "мама");
        List<Person> listPerson = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 3, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(new Person("j", 20, Person.Sex.MAN));

        System.out.println(listString.stream().sorted().collect(Collectors.toList()));
        System.out.println(listString.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList()));
        listPerson.stream().sorted((x, y) -> {
            if (x.sex != y.sex) {
                return x.sex.compareTo(y.sex);
            }
            return x.age - y.age;
        }).peek(p -> System.out.println(p.toString())).collect(Collectors.toList());

        String a = (listString.stream().flatMap(x -> Arrays.stream(x.split("")).peek(System.out::print)).max(String::compareTo).get());
        System.out.println();
        System.out.println(a);

        System.out.println(listPerson.stream().min(Comparator.comparingInt(p -> p.age)).get());

        System.out.println(listString.stream().flatMap(x -> Arrays.stream(x.split(""))).count());
        System.out.println(listString.stream().map(String::length).reduce((x, y) -> x + y).get());

        System.out.println((Integer) listString.stream().map(String::length).mapToInt(x -> x % 2 == 1 ? x : 0).sum());

        System.out.println(listString.stream().collect(Collectors.joining(":", "<p>", "/p")));

        System.out.println(listPerson.stream().collect(Collectors.toMap((Object::hashCode), (y -> y))));

        listPerson.stream().collect((Collectors.groupingBy(person -> person.sex))).keySet().forEach(System.out::println);
    }
}