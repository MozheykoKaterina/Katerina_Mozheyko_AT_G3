package main.java.tasks.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RunnerString {

    public static void main(String[] args) throws ParseException {

        new Duplicate().duplicate("I am java java i one two I I");
        System.out.println();

        new ArrayOfNumber().arrayOfNumber("J9a8v7a6j5v4a3ja2v1a0");

        new CurrentTime().currentTime();

        Date date = new Date();
        String str = new SimpleDateFormat("hh:mm dd.MM.yyyy").format(new Date());
        new NewString().newString(str);

        String log = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 granted\n" +
                "access_log.2020.09.07 212.168.101.7 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.8 granted\n" +
                "access_log.2020.09.07 212.168.101.5 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied";

        new Log().log(log);
    }
}








