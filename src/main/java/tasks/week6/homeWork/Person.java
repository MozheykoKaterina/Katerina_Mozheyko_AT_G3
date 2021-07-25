package main.java.tasks.week6.homeWork;

import java.util.Random;

public class Person {

    public String name;
    public String surname;
    public int age;

    public Person() {
        this.name = generateRandomHexString(6);
        this.surname = generateRandomHexString(6);
        this.age = (int) (15 + Math.random() * 15);
    }

    public static String generateRandomHexString(int length){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < length){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, length);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}