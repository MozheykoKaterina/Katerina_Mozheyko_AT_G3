package main.java.tasks.week4.classWork.readWrite;

import java.io.*;

public class MyDemo {

    public static void main(String[] args) throws IOException {
        read("new_file.txt");
        write("new_file1.txt", "111");
        read("new_file.txt");

    }

    public static void read(String fileName) throws IOException {

            BufferedReader in = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        }

    public static void write(String fileName, String text) throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.append(text);
        out.close();
    }

}
