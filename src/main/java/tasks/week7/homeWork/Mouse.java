package main.java.tasks.week7.homeWork;

public class Mouse {

    int number;
    private String pattern = "Mouse ";
    private String name = "Mouse ";

    public Mouse(int number) {
        this.name = name + number;
        this.number = number;
        System.out.println(getName());
    }

    public void peep() throws InterruptedException {
        System.out.println("Mouse " + number + " PEEP! ");
        Thread.currentThread().sleep(200);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
