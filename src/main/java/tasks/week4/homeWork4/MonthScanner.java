package main.java.tasks.week4.homeWork4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MonthScanner {

    public static void main(String[] args) throws ParseException {

        System.out.println("Enter the month!");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        if (month.equalsIgnoreCase("Stop")) {
            return;
        } else {
            SimpleDateFormat beforeFormat = new SimpleDateFormat("MMMM");
            Date dateMMMM = beforeFormat.parse(month);

            int monthPlusOne = dateMMMM.getMonth() + 1;

            switch (monthPlusOne) {
                case 0: {
                    System.out.println("январь");
                    break;
                }
                case 1: {
                    System.out.println("февраль");
                    break;
                }
                case 2: {
                    System.out.println("март");
                    break;
                }
                case 3: {
                    System.out.println("апрель");
                    break;
                }
                case 4: {
                    System.out.println("май");
                    break;
                }
                case 5: {
                    System.out.println("июнь");
                    break;
                }
                case 6: {
                    System.out.println("июль");
                    break;
                }
                case 7: {
                    System.out.println("август");
                    break;
                }
                case 8: {
                    System.out.println("сентябрь");
                    break;
                }
                case 9: {
                    System.out.println("октябрь");
                    break;
                }
                case 10: {
                    System.out.println("ноябрь");
                    break;
                }
                case 11: {
                    System.out.println("декабрь");
                    break;
                }
            }
            return;
        }
    }
}