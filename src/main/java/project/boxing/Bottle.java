package main.java.project.boxing;

import main.java.project.liquid.SparklingWater;
import main.java.project.liquid.Water;
import main.java.project.object.Bubble;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume) {
        this.volume = volume;
        System.out.printf(volume + " liter bottle created!").println();
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        SparklingWater water = new SparklingWater();
        water.pump(bubbles);

    }

    public void open() {
        System.out.printf(volume + " liter bottle opened!").println();
        SparklingWater water = new SparklingWater();
        water.setOpened(true, volume);

    }

    public void warm(int temperature) {
        SparklingWater water = new SparklingWater();
        water.setTemperature(temperature);
        System.out.printf("Warming water to: %s", temperature).println();

    }

    public SparklingWater getWater() {
        return water;

    }

    public void setWater(SparklingWater water) {
        this.water = water;

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}

