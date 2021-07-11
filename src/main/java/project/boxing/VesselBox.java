package main.java.project.boxing;

import main.java.project.vessel.Vessel;

public class VesselBox<T extends Vessel> {

    private T[] box;
    private int counter;
    private T vessel;

    public VesselBox() {
        box = (T[]) new Vessel[36];
        counter = 0;
    }

    public void add(T vessel) {
        if (counter < box.length) {
            box[counter++] = vessel;
        }
    }
}