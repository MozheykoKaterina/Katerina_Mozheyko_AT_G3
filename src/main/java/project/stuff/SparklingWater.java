package main.java.project.stuff;

import java.util.Arrays;
import java.util.List;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;


    public SparklingWater() {
        Bubble[] bubbles = new Bubble[(int)(1 * 10000)];
        List<Bubble> bubble = Arrays.asList(bubbles);
        for (int i = 0; i < bubble.size(); i++) {
            bubble.set(i, new Bubble());
        }
        System.out.printf("There are " + bubble.size() + " bubbles in the bottle.").println();
        //isOpened();
       //необходимо добавить объем воды
    }

    public void setOpened() {
        this.isOpened = true;
        System.out.printf("Water is open").println();
        isOpened();
    }

    private void isOpened() {
        /*t1.start();
        t1.sleep(120);*/
        Bubble[] bubbles = new Bubble[(int)(10000)];
        List<Bubble> bubble = Arrays.asList(bubbles);
        for (int i = 0; i < bubble.size(); i++) {
            bubble.set(i, new Bubble());
        }
        degas(bubble);
    }

    private void degas(List<Bubble> bubble) {
        int speed = (10 + 5) * getTemperature();
        System.out.println("bubble removal rate " + speed);
        for (Bubble bubble1 : bubble) {
            bubble.stream().skip(speed);
            new Bubble().cramp();
        }
        System.out.println();
    }

    public boolean isSparkle() {
        return true;
    }

    /*Thread t1 = new Thread(()-> {
        if (isOpened) {
            Bubble[] bubbles = new Bubble[(int)(10000)];
            List<Bubble> bubble = Arrays.asList(bubbles);
            for (int i = 0; i < bubble.size(); i++) {
                bubble.set(i, new Bubble());
            }
            degas(bubble);
        }

    });*/
}