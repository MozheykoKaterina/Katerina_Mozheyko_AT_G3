package main.java.tasks.week4.homeWork4;

import java.io.*;

public class Way {

    public static void read() {

        File folder = new File("D:/Courses/");
        File[] listOfFiles = folder.listFiles();
        String[] folderOfFiles = folder.list();
        for (int i = 0; i < folderOfFiles.length; i++) {
        }
        for (File file : listOfFiles) {
            System.out.println(file.getName());
        }
    }
}