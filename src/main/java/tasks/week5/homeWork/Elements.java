package main.java.tasks.week5.homeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Elements {

    public static void main(String[] args) {

        List<String> elements = Arrays.asList("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        elements.stream().map(x -> x + " ").forEach(System.out::print);

        System.out.println();

        System.out.println(elements.stream().filter(x -> x.contains(" ") || x.contains("-")).count());
        //elements.add(4, "Spinner");
        //elements.remove(2);
        //elements.set(5, "Switch");

        elements.stream().map(x -> x + " ").forEach(System.out::print);

    }
}