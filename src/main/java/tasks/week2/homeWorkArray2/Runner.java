package main.java.tasks.week2.homeWorkArray2;

import java.time.LocalDate;
import java.util.Date;

public class Runner {

    public static void main(String[] args) {

        new NewArrayRevers().newArrayRevers(7);

        new SumArrayElementsN().sumArrayElementsN(3);

        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        int day = localDate.getDayOfMonth();
        new DivisionByMonth().divisionByMonth(day);

        new Image().image();

    }
}


