package main.java.project.runner;

import main.java.project.material.Material;
import main.java.project.vessel.Bottle;

public class RunnerBottle {

    public static void main(String[] args) {

        Bottle bottle = new Bottle(0.5, Material.GLASS);
        Bottle bootle2 = new Bottle(1, Material.GLASS);
        Bottle bootle3 = new Bottle(1.5, Material.GLASS);


        bottle.warm(22);
        bootle2.warm(5);
        bootle3.warm(15);

        bottle.open();
        bootle2.open();
        bootle3.open();
    }
}