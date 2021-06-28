package main.java.tasks.week4.classWork.readWrite;

import main.java.tasks.week3.classWork.Person;

public class MyChangeDemo {

    public static void main(String[] args) {
        method1("coffe", 1, true, "tea", new Person("name Katrin", 25, 25, 164));
    }

    public static void method1(String world, int number, boolean condition, String doubleWorld, Person human) {
        System.out.println("I am method1: " + world + number + condition + doubleWorld + human);
        method2("coffe", 1, true, doubleWorld);
    }

    public static void method2(String world, int number, boolean condition, String douebleWorld) {
        System.out.println("I am method2: " + world + number + condition + douebleWorld);
        method3("coffe", 1);
    }

    public static void method3(String world, int number) {
        System.out.println("I am method3: " +  world + number);
        method4("coffe");
    }

    public static void method4(String world) {
        System.out.println("I am method4: " + world);
        method5();
    }

    public static void method5() {
        System.out.println("I am method5");
    }
}
