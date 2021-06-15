package main.java.projects.boxing;

import main.java.projects.liquid.SparklingWater;

public class Bottle {
    private double volumeBottle;
    private double volumeSparklingWater;
    private double temperature;


    SparklingWater sparklingWater = new SparklingWater();


    public Bottle(double volumeBottle, double volumeSparklingWater) {
        this.volumeBottle = volumeBottle;
        this.volumeSparklingWater = volumeSparklingWater;
        System.out.println(volumeBottle + " liter bottle created");
        SparklingWater sparklingWater = new SparklingWater();
        sparklingWater.pump(volumeSparklingWater);

    }

    public Bottle(double volumeBottle, double volumeSparklingWater, double temperature) {
        this.volumeBottle = volumeBottle;
        this.volumeSparklingWater = volumeSparklingWater;
        this.temperature = temperature;
        System.out.println(volumeBottle + " liter bottle with temperature of " + temperature + " created.");
        SparklingWater sparklingWater = new SparklingWater();
        sparklingWater.pump(volumeSparklingWater);
    }

    public Bottle() {
    }

    public void open() {
        System.out.println(volumeBottle + " liter bottle opened");
        SparklingWater sparklingWater = new SparklingWater();
        sparklingWater.degas(volumeSparklingWater);
    }

    public void openTemp() {
        System.out.println(volumeBottle + " liter bottle with temperature of " + temperature + " opened.");
        SparklingWater sparklingWater = new SparklingWater();
        sparklingWater.degasTemp(volumeSparklingWater, temperature);
    }

    public double getVolumeBottle() {
        return volumeBottle;
    }

    public void setVolumeBottle(double volumeBottle) {
        this.volumeBottle = volumeBottle;
    }

    public double getVolumeWater() {
        return volumeSparklingWater;
    }

    public void setVolumeWater(double volumeWater) {
        this.volumeSparklingWater = volumeWater;
    }

}


