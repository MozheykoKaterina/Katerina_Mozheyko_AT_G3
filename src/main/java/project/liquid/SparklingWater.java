package main.java.project.liquid;

import main.java.project.object.Bubble;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;
    double volume;
    int temperature;

    public SparklingWater(double volume) {
        isOpened(volume);
    }

    public void pump(Bubble[] bubbles) {
        int i;
        for (i = 0; i < bubbles.length; i++) {
            Bubble bubble = new Bubble();
            bubble = bubbles[i];
        }
        System.out.printf("There are " + i + " bubbles in the bottle.").println();
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = true;
        System.out.printf("Water is open").println();
    }

    private void isOpened(double volume) {
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        if (isOpened) {
            degas(bubbles);
        }
    }

    private void degas(Bubble[] bubbles) {
        this.bubbles = bubbles;
        for (int i = bubbles.length; i > 0; i--)
        new Bubble().cramp();
    }

    public boolean isSparkle() {
        return true;
    }
}