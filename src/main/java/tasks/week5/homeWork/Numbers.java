package main.java.tasks.week5.homeWork;

import java.util.*;

public class Numbers {

    public static void main(String[] args) {

        Integer[] array = {3342, 34, 79, 23426, 68, 1324, 55, 7699};
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(array));

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int count = 0;
        for (Integer number : numbers) {
            count = count + number;
        }
        System.out.println(count);

        Collections.sort(numbers);

        for (int i = 0; i < 8; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        Collections.reverse(numbers);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}