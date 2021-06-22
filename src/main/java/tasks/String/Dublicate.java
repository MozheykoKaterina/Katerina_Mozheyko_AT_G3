package main.java.tasks.String;

public class Dublicate {

    public void dublicate (String input) {

        String[] dublicate = input.split(" ");
        for (int i = 0; i < dublicate.length; i++) {
            if (dublicate[i] != null) {
                for (int a = i + 1; a < dublicate.length; a++) {
                    if (dublicate[i].equals(dublicate[a])) {
                        dublicate[a] = dublicate[i];
                        System.out.print(dublicate[i] + " ");
                        
                    }
                }
            }
        }
    }
}






