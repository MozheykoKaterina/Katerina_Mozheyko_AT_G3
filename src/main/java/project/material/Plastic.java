package main.java.project.material;

public class Plastic extends Material{

    private double thermalConductivity;
    private String color;
    private double density;

    public Plastic(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    public Plastic() {
        super(25, "white", 0.3);
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
