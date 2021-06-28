package main.java.tasks.week4.classWork.readWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {

    public static void write() throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("Katrin_Mozheyko");
        out.close();
    }
}
