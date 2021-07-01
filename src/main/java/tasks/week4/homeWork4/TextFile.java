package main.java.tasks.week4.homeWork4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFile {

    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("new_file.txt"));
        String line;
        int countWordSign = 0;

        while ((line = in.readLine()) != null) {
            int countInitial = line.length();
            String lineWithoutNumber = line.replaceAll("(\\d)", "");
            int countWithoutNumber = lineWithoutNumber.length();
            String lineWithoutSign = lineWithoutNumber.replaceAll("[\\\\?\\\\.;:'+\\\"]", "");
            int countWithoutSign = lineWithoutSign.length(); //длина без знаков
            String lineWord = lineWithoutSign.replaceAll("  ", " ");
            String[] arrayWord = lineWord.split("\\s");
            countWordSign = countWordSign + countWithoutNumber - countWithoutSign + arrayWord.length;
        }
        System.out.println("Number of words and punctuation marks: " + countWordSign);
        in.close();
    }
}