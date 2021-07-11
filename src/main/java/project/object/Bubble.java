package main.java.project.object;

public class Bubble {

    private double volume;
    private String structure;

    public Bubble() {
        this.volume = 03;
        this.structure = "gas";
    }

    public Bubble(String gas) {

    }

    public void cramp() {
        System.out.print("Cramp!");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }
}