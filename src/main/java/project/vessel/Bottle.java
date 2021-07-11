package main.java.project.vessel;

import main.java.project.liquid.SparklingWater;
import main.java.project.material.Glass;
import main.java.project.material.Material;
import main.java.project.object.Bubble;
import main.java.project.runner.MyThread;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bottle extends Vessel {

    private SparklingWater water;

    public Bottle(double volume) {
        super(volume, 3, 300, new Glass());
        this.water = new SparklingWater(volume);
        System.out.printf(volume + " liter bottle created!").println();
        Bubble[] bubbles = new Bubble[(int)(volume * 10000)];
        List<Bubble> bubble = Arrays.asList(bubbles);
        for (int i = 0; i < bubble.size(); i++) {
            bubble.set(i, new Bubble());
        }
        water.pump(bubble);

    }

    interface Containable {
    }

    public void open() {
        System.out.printf(volume + " liter bottle opened!").println();
        this.water = new SparklingWater(volume);
        water.setOpened(true);
    }

    public void warm(int temperature) {
        water.getTemperature();
        System.out.printf("Warming water to: %s", temperature).println();
    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }
}