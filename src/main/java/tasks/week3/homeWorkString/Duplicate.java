package main.java.tasks.week3.homeWorkString;

public class Duplicate {

    public void duplicate(String input) {

        String[] duplicate = input.split(" ");
        for (int i = 0; i < duplicate.length; i++) {
            if (duplicate[i] != null) {
                for (int a = i + 1; a < duplicate.length; a++) {
                    if (duplicate[i].equals(duplicate[a])) {
                        duplicate[a] = duplicate[i];
                        System.out.print(duplicate[i] + "," + " ");

                    }
                }
            }
        }
    }
}