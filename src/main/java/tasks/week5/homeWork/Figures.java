package main.java.tasks.week5.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Figures {

    public static void main(String[] args) {

        List<String> figures = new ArrayList<>();
        figures.add("Овал");
        figures.add("Прямоугольник");
        figures.add("Круг");
        figures.add("Квадрат");
        figures.add("Эллипс");

        for (String figure : figures ) {
            System.out.print(figure + "-");
        }
        System.out.println();

        int count = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i < 4; i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println();

        figures.add(3, "Треугольник");

        for (String figure : figures ) {
            System.out.print(figure + " ");
        }
    }
}