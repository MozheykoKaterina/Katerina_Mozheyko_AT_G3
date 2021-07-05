package main.java.tasks.week5.classWork;

import java.util.ArrayList;
import java.util.List;

public class MyListOne {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        String my = "Мама мыла раму мыла";
        String[] mySplit = my.split(" ");

        for (String a: mySplit) {
            myList.add(a);
            System.out.print(a + " ");
        }

        System.out.println();

        for (int i = 0; i < mySplit.length; i++) {
            myList.add(i, mySplit[i]);
            System.out.print(myList.get(i) + " ");
        }
    }
}