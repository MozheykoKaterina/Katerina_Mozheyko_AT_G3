package main.java.tasks.day3;

import java.util.Random;

public class DivisionByMonth {

    public void divisionByMonth(int n) {

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % n == 0) {
                System.out.print(array[i] + " ");
                a = array[i] + a;
            }
        }

        System.out.println();
        System.out.print(a);
        System.out.println();
    }
}

