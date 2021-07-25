package main.java.tasks.week7.homeWork;

import java.util.stream.IntStream;

public class ThreadMouse5 {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new).forEach(x -> {
                try {
                    x.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });});

        Thread t2 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new).forEach(x -> {
                try {
                    x.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });});

        Thread t3 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new).forEach(x -> {
                try {
                    x.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });});

        Thread t4 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new).forEach(x -> {
                try {
                    x.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });});

        Thread t5 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).boxed().map(Mouse::new).forEach(x -> {
                try {
                    x.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });});

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}