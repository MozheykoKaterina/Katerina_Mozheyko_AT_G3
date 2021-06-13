import java.util.Arrays;

public class SparklingWater extends Water {

    //private double volumeBottle;


    public void pump(Bubble[] bubbles) {
        for (int i = 0; i < bubbles.length; i++) {
            //bubbles = new Bubble[i];
        }
        System.out.println("Bubbles " + bubbles.length);
    }

    public void degas(Bubble[] bubbles) {
        for (int i = bubbles.length; i >= 0; i--) {
            //bubbles = new Bubble[i];
            new Bubble().cramp();
        }
        System.out.println("Bubbles " + bubbles.length);

    }
}












