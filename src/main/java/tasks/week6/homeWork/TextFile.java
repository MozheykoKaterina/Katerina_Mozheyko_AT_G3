package main.java.tasks.week6.homeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextFile {

    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("new_file.txt"));
        String line;
        List<String> list = new ArrayList<>();

        while ((line = in.readLine()) != null) {
            list.add(line);
                      //stream().map(x -> x.split("a")).forEach(System.out::println);
        }
        in.close();
        list.stream().skip(4).collect(Collectors.toList()).stream().map(x -> x.split("<br>")).forEach(System.out::println);
    }



    public static void main(String[] args) throws IOException {
        read();
    }
}
