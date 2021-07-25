package main.java.tasks.week7.classWork;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class RunnerFore {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            heavyMethod();
        });

        Thread t2 = new Thread(() -> {
            heavyMethod();
        });

        Thread t3 = new Thread(() -> {
            heavyMethod();
        });

        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.start();
        t3.setPriority(Thread.MIN_PRIORITY);


    }

    public static void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }
        System.out.printf("I am %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));

    }
}
