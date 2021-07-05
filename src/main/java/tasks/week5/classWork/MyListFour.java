package main.java.tasks.week5.classWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyListFour {

    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t0 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            myList1.add(i + " ");
        }
        int my1 = (int) (System.nanoTime() - t0);
        System.out.println(my1);

        t0 = System.nanoTime();
        Iterator<String> iterator = myList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        int my2 = (int) (System.nanoTime() - t0);
        System.out.println(my2);

        t0 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            myList2.add(i + " ");
        }
        int my3 = (int) (System.nanoTime() - t0);
        System.out.println(my3);

        t0 = System.nanoTime();
        Iterator<String> iterator1 = myList2.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        int my4 = (int) (System.nanoTime() - t0);
        System.out.println(my4);
    }
}