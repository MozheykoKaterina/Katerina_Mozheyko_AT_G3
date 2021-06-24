package main.java.project.runner;

import main.java.project.liquid.SparklingWater;

public class MyThread extends Thread {

    double volume;

        public void run() {
            SparklingWater sparklingWater = new SparklingWater(volume);
    }
}