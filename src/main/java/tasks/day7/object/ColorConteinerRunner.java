package main.java.tasks.day7.object;

public class ColorConteinerRunner {

    public static void colorConteinerRunner(String color) {

        switch (EColor.valueOf(color)) {
            case RED:
                System.out.println(EColor.RED);
            case BLUE:
                System.out.println(EColor.BLUE);
            case GREEN:
                System.out.println(EColor.GREEN);
            case YELLOW:
                System.out.println(EColor.YELLOW);
            case PURPLE:
                System.out.println(EColor.PURPLE);

        }
    }
}


