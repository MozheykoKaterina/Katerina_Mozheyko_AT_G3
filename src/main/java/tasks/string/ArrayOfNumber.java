package main.java.tasks.string;

public class ArrayOfNumber {

    public void arrayOfNumber(String input) {

        String arrayOfNumber = input.replaceAll("[^0-9]", "");
        String[] array = arrayOfNumber.split("");

        for (String i : array) {
            System.out.printf(i);
        }

        System.out.println();

        int[] arrayOnlyNumber = new int[array.length];
        for (int c = 0; c < array.length; c++) {
            arrayOnlyNumber[c] = Integer.parseUnsignedInt(array[c]);
            System.out.print(arrayOnlyNumber[c]);
        }
    }
}


