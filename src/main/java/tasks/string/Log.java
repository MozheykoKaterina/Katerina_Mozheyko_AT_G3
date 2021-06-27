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

        for (int d = 0; d < array1.length; d++) { //буду итерировать каждую позицию массива
            int count = 0;
            int countOk = 0;
            int countFa = 0;
            String a = "Ok";
            String b = "Failed";
            for (int e = 0; e < array1.length; e++) { //буду сравнивать с каждой позицией в массиве
                for (int e1 = 0; e1 < 3; e1++) {
                    if (array1[d][0] == array1[e][0]) {
                        if (e > d) {                     //если е позиция больше d, то бужем записывать
                            //array2[count][0] = array1[e][0];
                            if (array1[d][1] == null) {
                                array2[count][1] = array1[count][e1];
                                countOk = countOk + 1;
                            } else {
                                array2[count][2] = array1[count][e1];
                                countFa = countFa + 1;
                            }
                        } else {                        ///а если меньше, то увеличиваем количество попыток
                            array2[count][0] = array1[e][e1];
                            count = count + 1;
                            if (array1[d][1] == null) {
                                array2[count][1] = array1[count][e1];
                                countOk = countOk + 1;
                            } else {
                                array2[count][2] = array1[count][e1];
                                countFa = countFa + 1;
                            }
                        }
                        System.out.println(array2[d][0] + " ok " + countOk + " failed " + countFa);
                    }
                }
            }
        }
    }
}