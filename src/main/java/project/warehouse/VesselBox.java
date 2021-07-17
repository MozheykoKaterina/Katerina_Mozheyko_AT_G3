package main.java.project.warehouse;

import main.java.project.vessel.Containable;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class VesselBox implements Serializable {

    private String name = "I am box with <25> <Bottles>";
    private int capacity;
    private List<Containable> box;
    private long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VesselBox that = (VesselBox) o;
        return capacity == that.capacity && id == that.id && Objects.equals(name, that.name) && Objects.equals(box, that.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, box, id);
    }

    public VesselBox(String name, int capacity, long id) {
        this.name = name;
        this.capacity = capacity;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }
}