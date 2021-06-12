import java.util.Random;

public class Eight {

    static void eight() {

        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        int b = array[0];
        for (int i = 0; i < array.length; i++) {
            if (b < array[i]) {
            } else {
                b = array[i];
            }
        }
        System.out.println(b);
            }
}
