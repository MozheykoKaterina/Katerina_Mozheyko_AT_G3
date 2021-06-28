package main.java.tasks.week1.homeWorkArray;

import java.util.Random;

public class Elements {

    public void elements() {
        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

}
