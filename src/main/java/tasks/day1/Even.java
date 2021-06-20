package main.java.tasks.day1;

public class Even {

    public void even() {
        for (int i = 3; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
}

