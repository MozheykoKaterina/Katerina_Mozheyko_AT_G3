package main.java.project.boxing;

import main.java.project.liquid.SparklingWater;
import main.java.project.liquid.Water;
import main.java.project.object.Bubble;
import main.java.project.runner.MyThread;

public class Bottle {

    private double volume;
    private SparklingWater water;

    public Bottle() {
    }

    public Bottle(double volume) {
        this.volume = volume;
        System.out.printf(volume + " liter bottle created!").println();
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        new Bottle().setWater(water);
        SparklingWater water = new SparklingWater(volume);
        water.pump(bubbles);
        MyThread myThread = new MyThread();
        myThread.start();
    }

    public void open() {
        System.out.printf(volume + " liter bottle opened!").println();
        SparklingWater water = new SparklingWater(volume);
        water.setOpened(true);
    }

    public void warm(int temperature) {
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