package main.java.tasks.day5;

import java.text.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    int age = 35;
    String name = "Katrin";

    @Override
    public String toString() {
        return "Runer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws ParseException {

        Runner runer = new Runner();
        runer.toString();
        System.out.println(runer.toString());

        Person per1 = new Person("Katrin", 32, 164, 50);
        Person per2 = new Person("Irina", 32, 164, 50);
        Person per3 = new Person("Diana", 32, 164, 50);

        System.out.println(per1.hashCode());
        System.out.println(per2.hashCode());
        System.out.println(per3.hashCode());

        System.out.println(per1.equals(per2));

        per2.setName("Katrin");

        System.out.println(per1.hashCode());
        System.out.println(per2.hashCode());
        System.out.println(per3.hashCode());

        System.out.println(per1.equals(per2));

        method(5);

        int x = Integer.valueOf("234");
        System.out.println(x);

        String s = "Katrin";
        System.out.println(s.concat("Pasha"));
        System.out.println(s);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append(i + " ");
        }
        System.out.println(builder.reverse().toString().length());

        String sa = "Katerina1111!Mozheyko2222!AT3!G34!";
        String[] array = sa.split("\\d");

        for (String sx : array) {
            System.out.println(sx);

        }

        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        Date date = formatter.parse("19/06/2021");

        System.out.println(date.toString());

    }

    public static void method(Integer x) {
        System.out.println(x.toString());

    }

}
