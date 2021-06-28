package main.java.tasks.week4.classWork.readWrite;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase("Stop")) {
                return;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }
    }
}
