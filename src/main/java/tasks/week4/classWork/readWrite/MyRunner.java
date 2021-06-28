package main.java.tasks.week4.classWork.readWrite;

import java.io.IOException;

public class MyRunner {

    public static void main(String[] args) throws IOException {
        MyReader.read();
        MyWriter.write();
        MyReader.read();
    }
}
