package main.java.tasks.string;

import java.util.Arrays;

public class Log {

    public void log(String log) {

        String log1 = log.replaceAll(log.substring(0, 22), "");

        String[] array = log1.split("\n"); //одномерный массив

        String[][] array1 = new String[array.length][3]; //пустой двумерный массив

        for (int i = 0; i < array1.length; i++) { //заполняю двумерный массив

            String a = array[i].substring(0, 13); //IP
            String b = array[i].substring(14, 20); //granted or denied
            String c = null; //

            for (int j = 0; j < array1[i].length; j++) {

                if (array[i].substring(14, 20).equals("grante")) {
                    array1[i][0] = a;
                    array1[i][1] = b;
                    array1[i][2] = c;
                } else {
                    array1[i][0] = a;
                    array1[i][1] = c;
                    array1[i][2] = b;
                }
                System.out.print(array1[i][j]);
            }
            System.out.println();
        }

        String[][] array2 = new String[array1.length][3]; //создаю итоговый массив

        int count = 0;
        for (int d = 0; d < array1.length; d++) { //буду искать каждое значение первоначального массива в итоговом
            for (int d1 = 0; d1 < 3; d++) {
                for (int e = 0; e < array2.length; e++) {
                    for (int e1 = 0; e1 < 3; e++) {//if (array1[d][0] != array2[e][0]) {
                    }
                    //System.out.println(array2[e][e1]);
                }
            }
            System.out.println();
        }
    }
}