package main.java.projects.liquid;

import main.java.projects.object.Bubble;

public class SparklingWater extends Water {
    private double volumeSparklingWater;
    private int countBubbles;

    public void pump(double volumeSparklingWater) {
        volumeSparklingWater = volumeSparklingWater * 1000;
        for (int i = 1; i <= volumeSparklingWater; i++) {
            countBubbles = i * 10;
        }
        System.out.println("Count of bubbles " + countBubbles);
    }

    public void degas(double volumeSparklingWater) {
        volumeSparklingWater = volumeSparklingWater * 1000;
        for (int i = 1; i <= volumeSparklingWater; i++) {
            countBubbles = i * 10;
            Bubble bubble = new Bubble();
            bubble.cramp();
            System.out.println("Bubbles " + countBubbles);
            break;
        }
    }

    public void degasTemp(double volumeSparklingWater, double temperature) {
        volumeSparklingWater = volumeSparklingWater * 1000;
        for (int i = 1; i <= volumeSparklingWater; i++) {
            countBubbles = i * 10;
        }

        int speed = 10;
        for (int a = 1; a <= temperature; a++) {
            speed = speed + 5;
        }
        int times = countBubbles / speed;
        System.out.println(times + " sec");
        Bubble bubble = new Bubble();
        bubble.cramp();
        System.out.println("Bubbles " + countBubbles);
    }
}

