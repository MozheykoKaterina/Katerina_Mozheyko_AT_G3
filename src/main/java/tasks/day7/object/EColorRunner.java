package main.java.tasks.day7.object;

public class EColorRunner {

    public static void main(String[] args) {
        //new EColorRunner().printColor("red");
    }

    public void printColor(String color) {

        switch (EColor.valueOf(color)) {
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

    public static void printColorHex(int hex) {

        switch (EColor.byHex(hex)) {
            case BLUE:
                break;
        }
    }
}
