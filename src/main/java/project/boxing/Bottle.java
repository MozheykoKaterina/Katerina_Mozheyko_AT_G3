package src.main.java.project.boxing;

import src.main.java.project.liquid.SparklingWater;
import src.main.java.project.liquid.Water;
import src.main.java.project.object.Bubble;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume) {
        this.volume = volume;
        System.out.println(volume + " liter bottle created!");
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];

        SparklingWater water = new SparklingWater();
        water.pump(bubbles);

    }

    public void open() {
        this.volume = volume;
        System.out.println(volume + " liter bottle opened!");
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        SparklingWater water = new SparklingWater();
        water.degas(bubbles);
    }

    public void warm(int temperature) {

    }

    public SparklingWater getWater() {
        return water;

    }

    public void setWater(SparklingWater water){

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}

