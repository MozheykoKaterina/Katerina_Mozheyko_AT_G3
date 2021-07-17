package main.java.tasks.week5.homeWork;

import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        birds.stream().map(x -> "--" + x + "--").forEach(System.out::println);


    }
}