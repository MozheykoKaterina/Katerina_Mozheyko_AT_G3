package main.java.tasks.week7.homeWork;

import java.util.ArrayList;
import java.util.List;

public class ThreadMouse280 {

    public static void main(String[] args) throws InterruptedException {

        List<Mouse> mice = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            mice.add(new Mouse(i));
        }

        mice.stream().forEach(mouse -> {
            try {
                mouse.peep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t1 = new Thread(() -> {
            for (int i = 10; i > 0; i--) {
                if (i % 2 == 0) {
                    mice.remove(i);
                }
            }
        });


        t1.start();
        t1.sleep(300);

        mice.stream().forEach(System.out::println);
    }
}
