package src.main.java.tasks.day3;

import java.util.Random;

public class Sort {

    public void sort() {

        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        for (int i = array.length - 1; i > 0; i--) {
            for (int c = 0; c < i; c++) {
                if (array[c] < array[c + 1]) {
                    int temp = array[c];
                    array[c] = array[c + 1];
                    array[c + 1] = temp;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
