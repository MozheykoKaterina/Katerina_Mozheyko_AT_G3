package main.java.tasks.week7.classWork;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RunnerEight {

    static int j;

    public static void main(String[] args) throws InterruptedException {

        Map<Integer, Integer> list = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                list.put(i, i);
            }
        });

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 10000; i++) {
                list.forEach((k, v) -> j += v);
            }
        });

        t1.start();
        t2.start();
        t2.join();

        System.out.println(j);
    }
}