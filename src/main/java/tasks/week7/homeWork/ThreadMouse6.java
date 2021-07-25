package main.java.tasks.week7.homeWork;

import java.util.stream.IntStream;

public class ThreadMouse6 {

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                IntStream.rangeClosed(1, 26).boxed().map(Mouse::new).filter(x -> x.number % 2 == 1).forEach(x -> {
                    try {
                        x.peep();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
        }).start();
    }
}