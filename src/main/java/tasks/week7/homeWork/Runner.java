package main.java.tasks.week7.homeWork;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        new FooMaker().getDayOfWeek();
        new FooMaker().getDayOfWeek(12);
        new FooMaker().getNextDayOfWeek();
        new FooMaker().getDayFoo();
        new FooMaker().getRandom();
        System.out.println(new Mouse(5).toString());
        new Mouse(3).peep();
        new Hedgehog(2).tellMe();
    }
}
