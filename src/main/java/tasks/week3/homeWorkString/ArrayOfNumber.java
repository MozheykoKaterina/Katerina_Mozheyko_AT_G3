package main.java.tasks.week3.homeWorkString;

public class ArrayOfNumber {

    public void arrayOfNumber(String str) {

        String arrayOfNumber = str.replaceAll("[^0-9]", "");
        String[] array = arrayOfNumber.split("");

        for (String i : array) {
            System.out.printf(i);
        }

        System.out.println();

        int[] arrayOnlyNumber = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOnlyNumber[i] = Integer.parseUnsignedInt(array[i]);
            System.out.print(arrayOnlyNumber[i]);
        }
        System.out.println();
    }
}