package main.java.tasks.week5.homeWork;

import main.java.tasks.week5.homeWork.fields.Water;

import java.util.Arrays;
import java.util.List;

public class WaterRunner {

    public static void main(String[] args) {

        List<Water> water = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));

        water.stream().map(x -> new StringBuilder().append(x.getColor()).append("-").append(x.getColor())).forEach(System.out::println);
    }
}