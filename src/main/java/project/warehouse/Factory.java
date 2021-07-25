package main.java.project.warehouse;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;
import main.java.project.vessel.Containable;
import main.java.project.vessel.Vessel;

public class Factory {

    private Warehouse warehouse;

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Vessel vessel) {
        createVessel(volume, material, stuff, vessel);
    }

    private Containable createVessel(double volume, Material material, Transformable stuff, Vessel vessel) {
        return createVessel(volume, material, stuff, vessel);
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}