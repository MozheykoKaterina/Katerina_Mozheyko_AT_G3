package main.java.tasks.week7;

import java.util.stream.IntStream;

public class DemoThread extends Thread {

    public void run() {
        IntStream.range(0, 100).forEach(System.out::println);
    }
}
