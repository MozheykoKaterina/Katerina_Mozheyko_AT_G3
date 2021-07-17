package main.java.tasks.week5.homeWork;

import main.java.tasks.week5.homeWork.fields.Person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class People {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));

        people.stream().map(x -> x.getAge() + " ").forEach(System.out::print);

        System.out.println();

        people.stream().map(x -> x.getName() + " ").forEach(System.out::print);

        System.out.println();

        people.stream().map(x -> x.toString() + " ").forEach(System.out::println);
    }
}