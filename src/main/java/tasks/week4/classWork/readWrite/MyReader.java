package main.java.tasks.week4.classWork.readWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {

    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("new_file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
