package main.java.tasks.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RunnerString {

    public static void main(String[] args) throws ParseException {

        String duplicate = "I am java java i one two I I";
        new Duplicate().duplicate(duplicate);
        System.out.println();

        String arrayOfNumber = "J9a8v7a6j5v4a3ja2v1a0";
        new ArrayOfNumber().arrayOfNumber(arrayOfNumber);

        CurrentTime currentTime = new CurrentTime();
        currentTime.currentTime();

        Date date = new Date();
        String str = new SimpleDateFormat("hh:mm dd.MM.yyyy").format(new Date());
        System.out.println(str);
        NewString newString = new NewString();
        newString.newString(str);
    }
}









