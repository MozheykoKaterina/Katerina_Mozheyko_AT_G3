package main.java.project.vessel;

import main.java.project.liquid.SparklingWater;
import main.java.project.material.Glass;
import main.java.project.material.Material;
import main.java.project.object.Bubble;
import main.java.project.runner.MyThread;

public class Bottle extends Vessel {

    private double volume;
    private double diameter;
    private int weight;
    private Material material;
    private SparklingWater water;

    public Bottle(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    public Bottle(double volume) {
        super(volume, 3, 300, new Glass());
        this.volume = volume;
        System.out.printf(volume + " liter bottle created!").println();
        setWater(water);
        SparklingWater water = new SparklingWater(volume);
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        water.pump(bubbles);
        MyThread myThread = new MyThread();
        myThread.start();
    }

    interface Containable {
    }

    public void open() {
        System.out.printf(volume + " liter bottle opened!").println();
        SparklingWater water = new SparklingWater(volume);
        water.setOpened(true);
    }

    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }
}