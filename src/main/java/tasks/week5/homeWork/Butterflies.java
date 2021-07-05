package main.java.tasks.week5.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterflie : butterflies) {
            System.out.print("\"" + butterflie + "\"" + " ");
        }
        System.out.println();

        int count = 0;
        for (String butterflie : butterflies) {
            if (butterflie.contains("o")) {
                count++;
            }
        }
        System.out.printf(String.valueOf(count)).println();

        for (int i = 0; i < 4; i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        System.out.println();

        for (String butterflie : butterflies) {
            System.out.print(butterflie + "\n");
        }
    }
}