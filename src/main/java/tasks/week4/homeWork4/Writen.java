package main.java.tasks.week4.homeWork4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Writen {

    public static void write() throws IOException {

        for (int d = 0; d < 2; d++) {
            BufferedWriter out = new BufferedWriter(new FileWriter("D:/Katerina_Mozheyko_AT_G3/" + d + ".txt"));
            Random random = new Random();
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
                int a = array[i];
                String b = String.valueOf(a + " ");
                out.append(b);
            }
            out.close();
        }
    }
}