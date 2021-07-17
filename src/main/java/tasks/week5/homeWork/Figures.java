package main.java.tasks.week5.homeWork;

import java.util.Arrays;
import java.util.List;


public class Figures {

    public static void main(String[] args) {

        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        figures.stream().map(x -> x + "-").forEach(System.out::print);

        System.out.println();

        //figures.add(3, "Треугольник");

        figures.stream().map(x -> x + " ").forEach(System.out::print);
    }
}