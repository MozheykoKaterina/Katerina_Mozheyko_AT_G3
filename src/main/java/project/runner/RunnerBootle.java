package main.java.project.runner;

import main.java.project.boxing.Bottle;
import main.java.project.liquid.SparklingWater;

public class RunnerBootle {

    public static void main(String[] args) {

        Bottle bottle = new Bottle(0.5);
        Bottle bootle2 = new Bottle(1);
        Bottle bootle3 = new Bottle(1.5);

        bottle.warm(22);
        bootle2.warm(5);
        bootle3.warm(15);

        bottle.open();
        bootle2.open();
        bootle3.open();









    }

}

