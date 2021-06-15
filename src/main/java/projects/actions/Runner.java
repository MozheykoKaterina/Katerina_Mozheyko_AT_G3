package main.java.projects.actions;

import main.java.projects.boxing.Bottle;

public class Runner {

    public static void main(String[] args) {

        Bottle bootle = new Bottle(0.5, 0.5);
        Bottle bootle2 = new Bottle(1, 1);
        Bottle bootle3 = new Bottle(1.5, 1.5);

        Bottle open = new Bottle();
        bootle.open();
        bootle2.open();
        bootle3.open();

        Bottle bootle4 = new Bottle(1.5, 1.5, 5);
        Bottle bootle5 = new Bottle(1.5, 1.5, 22);

        bootle4.openTemp();
        bootle5.openTemp();

    }

}
