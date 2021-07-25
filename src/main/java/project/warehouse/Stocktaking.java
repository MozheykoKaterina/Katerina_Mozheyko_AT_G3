package main.java.project.warehouse;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.vessel.Bottle;

import java.io.*;

public class Stocktaking {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //registerBox();
        //readSer();
        new Factory().createVesselBox(25, 0.5, Material.PLASTIC, new SparklingWater(0.5), new Bottle(0.5, Material.PLASTIC));
    }

    public static void registerBox(VesselBox box) throws IOException {
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(box);
        oos.close();
    }

    public static void disposeBox(VesselBox box) {

    }

    /*public static void getInfo() {
        System.out.println(VesselBox);
    }*/

    public static void readSer() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //Warehouse box = (Warehouse) ois.readObject();
        System.out.println(fis.toString());
        ois.close();

    }
}