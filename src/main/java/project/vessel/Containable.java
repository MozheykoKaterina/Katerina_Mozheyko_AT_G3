package main.java.project.vessel;

import main.java.project.stuff.Transformable;

public interface Containable {

    void addStuff(Transformable stuff); //adds some stuff (e.g. water, sand) to Containable object
    Transformable removeStuff(); //removes all stuff away
    boolean isEmpty(); //returns true if there is no stuff inside
    void open(); //forces Containable to be opened
    void warm(int temperature); //forces Containable to be closed
}
