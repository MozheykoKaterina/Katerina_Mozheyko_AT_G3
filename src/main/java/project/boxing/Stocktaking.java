package main.java.project.boxing;

import java.io.*;

public class Stocktaking {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeSer();
        readSer();
    }

    public static void writeSer() throws IOException {

        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject();
        oos.close();
    }

    public static void readSer() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Warehouse box = (Warehouse) ois.readObject();
        ois.close();
        System.out.println(box);
    }
}


