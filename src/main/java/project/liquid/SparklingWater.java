package src.main.java.project.liquid;

import src.main.java.project.object.Bubble;

public class SparklingWater extends Water {

    boolean isOpened;
    Bubble[] bubbles;

    public SparklingWater() {

    }

    public SparklingWater(boolean isOpened) {
        this.isOpened = isOpened;
    }

    public void pump(Bubble[] bubbles) {
        for (int i = 0; i < bubbles.length; i++) {
            //bubbles = new Bubble[i];
        }
        System.out.println("Bubbles " + bubbles.length);
    }

    public void setOpened(boolean isOpened) {

    }

    private void setOpened() {
        SparklingWater sparklingWater = new SparklingWater();
        sparklingWater.degas(bubbles);
    }

    public void degas(Bubble[] bubbles) {
        for (int i = bubbles.length; i >= 0; i--) {
            new Bubble().cramp();
        }
        System.out.println("Bubbles " + bubbles.length);

    }

    public boolean isSparkle() {
        return true;

    }

}