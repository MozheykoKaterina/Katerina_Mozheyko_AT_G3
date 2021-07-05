package main.java.tasks.week5.classWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListTwo {

    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            myList1.add(i + " ");
        }
        int arrayList = (int) (System.currentTimeMillis() - t0);
        System.out.println(arrayList );

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            myList2.add(i + " ");
        }

        int linkedList = (int) (System.currentTimeMillis() - t0);
        System.out.println(linkedList);


    }
}