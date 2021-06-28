package main.java.tasks.week4.classWork.readWrite;

import main.java.tasks.week3.classWork.Person;

import java.io.*;

public class MySerializer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeSer();
        readSer();
    }

    public static void writeSer() throws IOException {

        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person("name Katrin", 32, 164, 50));
        oos.close();
    }

    public static void readSer() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person human = (Person) ois.readObject();
        ois.close();
        System.out.println(human);
    }
}
