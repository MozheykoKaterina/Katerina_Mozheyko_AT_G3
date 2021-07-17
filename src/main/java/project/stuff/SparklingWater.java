package main.java.project.stuff;

import main.java.project.stuff.Bubble;
import main.java.project.stuff.Water;

import java.util.Arrays;
import java.util.List;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble bubble;

    public SparklingWater(double volume) {

        isOpened(volume);
    }

    public void pump(List<Bubble> bubble) {
        System.out.printf("There are " + bubble.size() + " bubbles in the bottle.").println();
        }

    public void setOpened(boolean isOpened) {
        this.isOpened = true;
        System.out.printf("Water is open").println();

    }

    private void isOpened(double volume) {
        Bubble[] bubbles = new Bubble[(int)(volume * 10000)];
        List<Bubble> bubble = Arrays.asList(bubbles);
        for (int i = 0; i < bubble.size(); i++) {
            bubble.set(i, new Bubble());
        }
        if (isOpened) {
            degas(bubble);
       }
    }

    private void degas(List<Bubble> bubble) {
        int speed = (10 + 5) * getTemperature();
        for (Bubble bubble1 : bubble) {
            bubble.stream().skip(speed);
            new Bubble().cramp();
        }
    }

    public boolean isSparkle() {
        return true;
    }
}