package main.java.project.liquid;

import main.java.project.stuff.Transformable;

public class Sand implements Transformable {

    private int temperature = 0;
    @Override
    public void setOpened() {
            }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}