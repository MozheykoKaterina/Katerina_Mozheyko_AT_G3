package main.java.tasks.day3;

import java.util.Random;

public class NewArrayRevers {

    public void newArrayRevers(int n) {

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arrayRevers = new int[20];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                arrayRevers[i] = array[i];
                System.out.print(arrayRevers[i] + " ");
            }
        }
        System.out.println();
        System.out.println();

    }

}