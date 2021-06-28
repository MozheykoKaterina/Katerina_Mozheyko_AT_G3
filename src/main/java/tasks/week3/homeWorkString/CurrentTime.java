package main.java.tasks.week3.homeWorkString;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

    public void currentTime() {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("Сейчас на дворе:\ndd MMMM, yyyy, HH часа mm минут");
        System.out.println(dateFormat.format(date));

    }
}