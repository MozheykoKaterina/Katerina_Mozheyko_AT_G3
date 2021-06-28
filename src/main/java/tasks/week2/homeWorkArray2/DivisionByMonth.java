package main.java.tasks.week2.homeWorkArray2;

import java.util.Random;

public class DivisionByMonth {

    public void divisionByMonth(int n) {

        System.out.println(n);

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % n == 0) {
                System.out.print(array[i] + " ");
            }

        }

        System.out.println();
        System.out.println();

    }
}