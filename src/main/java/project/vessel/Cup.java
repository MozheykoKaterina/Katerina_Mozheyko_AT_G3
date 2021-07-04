package main.java.project.vessel;

import main.java.project.material.Glass;
import main.java.project.material.Material;
import main.java.project.material.Plastic;

public class Cup extends Vessel {

    private double volume;
    private double diameter;
    private int weight;
    private Material material;

    public Cup (double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    public Cup() {
        super(0.3, 10, 200, new Plastic());
    }

    interface Containable {
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
}
