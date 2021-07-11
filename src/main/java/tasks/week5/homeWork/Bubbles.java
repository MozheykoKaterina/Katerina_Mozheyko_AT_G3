package main.java.tasks.week5.homeWork;

import java.util.*;

import main.java.tasks.week5.homeWork.fields.Bubble;

public class Bubbles {

    public static void main(String[] args) {

        Bubble bubble1 = new Bubble(2, "O2");
        Bubble bubble2 = new Bubble(4, "CO2");
        Bubble bubble3 = new Bubble(5, "CO");

        Bubble[] array = {bubble1, bubble2, bubble3};
        ArrayList<Object> bubbles = new ArrayList<>(Arrays.asList(array));
    }
}