package main.java.tasks.week1.homeWorkArray;

public class ReverseArray {

    public void reverseAwway () {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int a = array[0];
        for (int i = array.length - 1; i >= 0; i--) {
            a = array[i];
            System.out.print(a + " ");
        }
        System.out.println(" ");


    }
}
