package main.java.project.warehouse;

import java.io.Serializable;
import java.util.Map;

public class Warehouse implements Serializable {

    private Map<Integer, VesselBox> stock;
    private int count;

    public void addBox(VesselBox box) {
        if (count < stock.size()) {
            stock.put(count, box);
            count++;
        }
    }

    public VesselBox getBox() {
        return getBox();
    }

    public void removeBox() {
        if (count > 0) {
            stock.remove(count);
        }
    }
}