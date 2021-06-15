package src.main.java.tasks.day3;

import java.util.Random;

public class Array {

    public void array() {
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