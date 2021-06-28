package main.java.tasks.week4.classWork.constant;

import java.util.Locale;

public class EColorRunner {

    public static void main(String[] args) {
        new EColorRunner().printColor("red");
        new EColorRunner().printColorHex(1);
    }

    public void printColor(String color) {

        switch (EColor.valueOf(color.toUpperCase(Locale.ROOT))) {
            case RED :
                System.out.println(EColor.RED);
            case BLUE :
                System.out.println(EColor.BLUE);
            case GREEN:
                System.out.println(EColor.GREEN);
            case YELLOW:
                System.out.println(EColor.YELLOW);
            case PURPLE:
                System.out.println(EColor.PURPLE);
        }
    }

    public void printColorHex(int hex) {

        switch (EColor.byHex(hex)) {
            case BLUE:
                break;
        }
    }
}
