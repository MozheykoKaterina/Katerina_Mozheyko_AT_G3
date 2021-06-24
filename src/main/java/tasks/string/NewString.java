package main.java.tasks.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NewString {

    public void newString(String str) throws ParseException {

        SimpleDateFormat dt = new SimpleDateFormat("hh:mm dd.MM.yyyy");
        Date date = dt.parse(str);
        SimpleDateFormat dt1 = new SimpleDateFormat("MMMM, dd, yyyy hh:mm", Locale.ENGLISH);
        System.out.println(dt1.format(date));

    }
}