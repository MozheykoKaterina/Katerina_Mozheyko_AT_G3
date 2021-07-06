package main.java.tasks.week5.homeWork;

import java.util.*;

import main.java.tasks.week5.homeWork.fields.Bubble;

public class Bubbles {

    public static void main(String[] args) {

        Bubble bubble1 = new Bubble(2, "O2");
        Bubble bubble2 = new Bubble(4, "CO2");
        Bubble bubble3 = new Bubble(5, "CO");

        Bubble[][] array = {{bubble1}, {bubble3}, {bubble3}};
        Map<Integer, String> bubbles = new HashMap<Integer, String>();
        bubbles.put(bubble1.getVolume(), bubble1.getName());
        bubbles.put(bubble2.getVolume(), bubble2.getName());
        bubbles.put(bubble3.getVolume(), bubble3.getName());

        for (int bubble : bubbles.keySet()) {
            System.out.print(bubble + " ");
        }
        System.out.println();

        for (String bubble : bubbles.values()) {
            System.out.print(bubble + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, String> entry : bubbles.entrySet()) {
            System.out.println(bubbles.toString());
        }
    }
}