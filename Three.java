import java.util.Random;

public class Three {

    static void three() {
        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

}
