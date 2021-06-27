package main.java.tasks.day7.object;

public class PrintColor {

        public static void printColor(String color) {

            String aColor = color;

            switch (aColor) {
                case ConstantContainer.RED :
                    System.out.println(ConstantContainer.RED);
                    break;
                case "blue" :
                    System.out.println(ConstantContainer.BLUE);
                    break;
                case "green" :
                    System.out.println(ConstantContainer.GREEN);
                    break;
                case "yellow" :
                    System.out.println(ConstantContainer.YELLOW);
                    break;
                case "purple" :
                    System.out.println(ConstantContainer.PURPLE);
                    break;
            }
    }

}
