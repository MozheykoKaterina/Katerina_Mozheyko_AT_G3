package main.java.project.warehouse;

import java.io.*;

public class Stocktaking {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        registerBox(new VesselBox("vessel", 25, 1));
        readSer();

    }

    private Stocktaking() {
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
        System.out.println(fis);
        ois.close();

    }
}