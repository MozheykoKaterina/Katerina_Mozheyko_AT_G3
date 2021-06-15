package src.main.java.tasks.day5;

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

        int[] array1 = new int[20];
        //for (int c = 0; c < array.length; c++) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                array1[i] = array[i];
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
