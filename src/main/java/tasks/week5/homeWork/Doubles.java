package main.java.tasks.week5.homeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Doubles {

    public static void main(String[] args) {

        Double[] array = {33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9};
        ArrayList<Double> doubles = new ArrayList(Arrays.asList(array));

        for (Double num : doubles) {
            System.out.print(num + " ");
        }
        System.out.println();

        double multiplication = 1;
        for (Double num : doubles) {
            multiplication = multiplication * num;
        }
        System.out.println(multiplication);

        double sum = 0;
        for (Double num : doubles) {
            sum = sum + Math.ceil(num) - num;
        }
        System.out.println(sum);

        for (int i = 0; i < 8; i++) {
            System.out.print(doubles.get(i).intValue() + " ");
        }
    }
}