package main.java.project.runner;

import main.java.project.vessel.Containable;
import main.java.project.warehouse.VesselBox;

import java.util.*;

public class RunnerWarehouse {

    public static void main(String[] args) {

        List<Containable> bottle = new ArrayList<>();
        VesselBox ves = new VesselBox(1, "My first box", 25, bottle);
    }
}

