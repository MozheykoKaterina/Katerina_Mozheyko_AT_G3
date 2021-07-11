package main.java.tasks.week6.classWork;

import java.util.Arrays;
import java.util.List;

public class RunnerPerson {

    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 3, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int count = 0;
        for (Person person : list) {
            if ((person.sex == Person.Sex.MAN & person.age < 60 & person.age > 18) ||
                    (person.sex == Person.Sex.WOMEN & person.age < 55 & person.age > 18)) {
                count = count + 1;
            }
        }
        System.out.println(count);

        System.out.println(list.stream().filter(person -> person.sex == Person.Sex.MAN & person.age < 60 & person.age > 18 ||
                person.sex == Person.Sex.WOMEN & person.age < 55 & person.age > 18).count());
    }
}



