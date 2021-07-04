package main.java.project.boxing;

import main.java.project.vessel.Bottle;
import main.java.project.vessel.Cup;
import java.io.Serializable;

public class Warehouse<T> implements Serializable {

    public static void main(String[]  args) {

        VesselBox<Bottle> boxBottle = new VesselBox<>(new Bottle(0.5));
        for (int i = 0; i < 9; i++) {
            boxBottle.add(new Bottle(0.5));
        }
        System.out.println(boxBottle);

        VesselBox<Cup> boxCup = new VesselBox<Cup>(new Cup());
        for (int i = 0; i < 25; i++) {
            boxCup.add(new Cup());
        }
        System.out.println(boxCup);
    }
}