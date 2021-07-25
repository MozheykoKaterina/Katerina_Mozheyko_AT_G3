package main.java.tasks.week7.classWork;

public class RunnerNine {

    static long j;

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1000000; i++) {
                    j++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 900000; i++) {
                    j--;
                }
            }
        });

        t1.start();
        t2.start();
        t2.join();

        System.out.println(j);
    }

}
