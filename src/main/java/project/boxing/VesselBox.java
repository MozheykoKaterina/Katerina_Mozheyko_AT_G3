package main.java.project.boxing;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import main.java.project.vessel.Vessel;

public class VesselBox<T extends Vessel> {

    private T[] box;
    private int counter;
    private T vessel;

    public VesselBox(T vessel) {
        this.vessel = vessel;
        if (vessel == new Bottle(0.5)) {
            box = (T[]) new Vessel[9];
            counter = 0;
        } else if (vessel == new Cup()) {
            box = (T[]) new Vessel[25];
            counter = 0;
        } else {
            box = (T[]) new Vessel[36];
            counter = 0;
        }
    }

    public void add(T vessel) {
        if (counter < box.length) {
            box[counter++] = vessel;
        }
    }
}