package main.java.tasks.week7.homeWork;

import java.time.LocalDate;
import java.util.Random;

public class FooMaker {

    private int random = new Random().nextInt(100);

    public int getDayOfWeek() {
        LocalDate date = LocalDate.now();
        int dayOfWeek = date.getDayOfWeek().getValue();
        System.out.println(dayOfWeek);
        return dayOfWeek;
    }

    public int getDayOfWeek(int next) {
        LocalDate date = LocalDate.now();
        int dayOfWeekNext = (date.getDayOfWeek().getValue() + next) % 7;
        System.out.println(dayOfWeekNext);
        return dayOfWeekNext;
    }

    public int getNextDayOfWeek() {
        LocalDate date = LocalDate.now();
        int dayOfWeekOne = date.getDayOfWeek().getValue() + 1;
        System.out.println(dayOfWeekOne);
        return dayOfWeekOne;
    }

    public int getDayFoo() {
        return getDayFoo() + random;
    }

    public int getRandom() {
        System.out.println(random);
        return random;
    }
}
