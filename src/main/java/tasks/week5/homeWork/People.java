package main.java.tasks.week5.homeWork;

import main.java.tasks.week5.homeWork.fields.Person;

import java.util.HashMap;
import java.util.Map;

public class People {

    public static void main(String[] args) {

        Map<Integer, String> peoples = new HashMap<Integer, String>();
        Person person = new Person(32, "Коля");
        Person person1 = new Person(24, "Оля");
        Person person2 = new Person(55, "Вася");
        Person person3 = new Person(63, "Маша");
        peoples.put(person.getAge(), person.getName());
        peoples.put(person1.getAge(), person1.getName());
        peoples.put(person2.getAge(), person2.getName());
        peoples.put(person3.getAge(), person3.getName());

        for (int people : peoples.keySet()) {
            System.out.print(people + " ");
        }
        System.out.println();

        for (String people : peoples.values()) {
            System.out.print(people + " ");
        }
        System.out.println();
    }
}