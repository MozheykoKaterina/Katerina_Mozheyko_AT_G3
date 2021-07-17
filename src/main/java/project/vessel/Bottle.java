package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Bubble;
import main.java.project.stuff.Transformable;
import java.util.Arrays;
import java.util.List;

public class Bottle extends Vessel implements Containable {

    private SparklingWater water;

    public Bottle(double volume, Material material) {
        super(volume, 2, material.getDensity() * volume / 4, material);
        this.water = new SparklingWater(volume);
        System.out.printf("Bottle " + volume + " liter and " + material.getDensity() * volume / 4 + " weight liter bottle created!").println();
        Bubble[] bubbles = new Bubble[(int)(volume * 10000)];
        List<Bubble> bubble = Arrays.asList(bubbles);
        for (int i = 0; i < bubble.size(); i++) {
            bubble.set(i, new Bubble());
        }
        water.pump(bubble);

    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open() {
        System.out.printf(getVolume() + " liter bottle opened!").println();
        this.water = new SparklingWater(getVolume());
        water.setOpened(true);
    }

    @Override
    public void close() {

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