package main.java.tasks.week7.homeWork;

public class Hedgehog {

    int number;
    private String pattern = "Hedgehog " + number;
    private String name = "Hedgehog <n>";


    public Hedgehog(int number) {
        this.name = name;
        this.number = number;
    }

    public void tellMe() throws InterruptedException {
        System.out.println("I am Hedgehog " + number);
        Thread.currentThread().sleep(50);
    }
}

