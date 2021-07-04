package main.java.project.material;

public class Glass extends Material {

    private double thermalConductivity;
    private String color;
    private double density;

    public Glass(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Glass() {
        super(1.5, "green", 25.0);
    }

    public double getThermalConductivity() {
        return thermalConductivity;
    }

    public void setThermalConductivity(double thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}