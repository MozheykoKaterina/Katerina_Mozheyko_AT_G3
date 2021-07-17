package main.java.tasks.week6.classWork;

public class RunnerExcep {

    public static void main(String[] args) {

        int a = 2;
        int b = 0;

        int[] array = {};

        try {
            System.out.println(array[3]);
            System.out.println(a/b);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("bugaga");
    }
}