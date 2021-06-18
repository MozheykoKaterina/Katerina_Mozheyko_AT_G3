package src.main.java.project.liquid;

import src.main.java.project.boxing.Bottle;
import src.main.java.project.object.Bubble;

public class SparklingWater extends Water {

    boolean isOpened;
    Bubble[] bubbles;
    double volume;

    public void SparklingWater(double volume) {
        this.volume = volume;
        isOpened(volume);

    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        int i;
        for (i = 0; i < bubbles.length; i++) {
            Bubble bubble = new Bubble();
            bubble = bubbles[i];
        }
        System.out.printf("There are " + i + " bubbles in the bottle.").println();
    }

    public void setOpened(boolean isOpened, double volume) {
        isOpened = true;
        System.out.printf("Water is open").println();
        SparklingWater water = new SparklingWater();
        water.SparklingWater(volume);

    }

    private void isOpened(double volume) {
        Thread thread = new Thread();
        thread.start();
        if (isOpened = true) {
            Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
            new SparklingWater().degas(bubbles);
        }

    }

    private void degas(Bubble[] bubbles) {
        int speed = 10 + 5;
        int countBubbles = bubbles.length;
        int time;
        time = countBubbles / speed;
        System.out.println(time);
        new Bubble().cramp();
    }

    public boolean isSparkle() {
        return true;
    }

}






