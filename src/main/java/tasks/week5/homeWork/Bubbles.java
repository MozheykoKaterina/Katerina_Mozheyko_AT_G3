package main.java.tasks.week5.homeWork;

import java.util.*;

import main.java.tasks.week5.homeWork.fields.Bubble;

public class Bubbles {

    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "O2"),
                new Bubble(4, "CO2"),
                new Bubble(5, "CO"));

        bubbles.stream().map(x -> x.getVolume() + " ").forEach(System.out::print);

        System.out.println();

        bubbles.stream().map(x -> x.getName() + " ").forEach(System.out::print);

        System.out.println();

        System.out.println(bubbles.stream().map(x -> x.getVolume()).reduce((x, y) -> x + y).get());

        bubbles.stream().map(x -> x.toString() + " ").forEach(System.out::println);
    }
}