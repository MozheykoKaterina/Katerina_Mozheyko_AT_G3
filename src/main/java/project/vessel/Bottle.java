package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Bubble;
import main.java.project.stuff.Transformable;
import java.util.Arrays;
import java.util.List;

public class Bottle extends Vessel implements Containable {

    private Transformable stuff;

    public Bottle(double volume, Material material) {
        super(volume, 2, material);
        setVolume(volume);
        System.out.printf("Bottle " + volume + " liter and " + material.getDensity() * volume / 4 + " weight liter bottle created!").println();
    }

    @Override
    public void addStuff(Transformable stuff) {
        this.stuff = stuff;
        System.out.println("The bottle contains " + getVolume() + " liter of water");
    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (stuff == null) {
            System.out.printf(getVolume() + " bottle is empty").println();
            return true;
        }
        return false;
    }
    public void open() {
        System.out.printf(getVolume() + " liter bottle opened!").println();
        stuff.setOpened();
    }

    public void warm(int temperature) {
        stuff.setTemperature(temperature);
        System.out.printf("Warming water to: %s", temperature).println();
    }

}