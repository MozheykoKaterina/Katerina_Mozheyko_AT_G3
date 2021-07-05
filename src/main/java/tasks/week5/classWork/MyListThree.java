package main.java.tasks.week5.classWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyListThree {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        String my = "Мама мыла раму мыла";
        String[] mySplit = my.split(" ");

        for (String a : mySplit) {
            mySet.add(a);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}