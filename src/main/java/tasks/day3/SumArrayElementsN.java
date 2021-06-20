package main.java.tasks.day3;

import java.util.Random;

public class SumArrayElementsN {

    public void sumArrayElementsN(int n) {

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % n == 0) {
                System.out.print(array[i] + " ");
                a = array[i] + a;
            }
        }
        System.out.println();
        System.out.println(a);
        System.out.println();
    }
}








