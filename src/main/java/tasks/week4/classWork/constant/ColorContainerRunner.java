package main.java.tasks.week4.classWork.constant;

public class ColorContainerRunner {

    public static void colorContainerRunner(String color) {

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


