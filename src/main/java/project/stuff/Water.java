package main.java.project.stuff;

public class Water implements Transformable {

    @Override
    public void setOpened() {
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private String color = "no";
    private String smell = "no";
    private int temperature = 0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }
}