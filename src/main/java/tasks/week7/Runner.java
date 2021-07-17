package main.java.tasks.week7;

import java.util.stream.IntStream;

public class Runner {

    public static void main(String[] args) {

        //Runnable task = () -> IntStream.range(0, 100).forEach(System.out::println);

        /*Thread thread = new Thread(task);
        thread.start();*/

        /*DemoThread thread = new DemoThread();
        thread.start();*/

        /*Thread thread = new Thread(() -> IntStream.range(0, 100).forEach(System.out::println));
        thread.start();*/

        new Thread(() -> IntStream.range(0, 100).forEach(System.out::println)).start();
    }
}
