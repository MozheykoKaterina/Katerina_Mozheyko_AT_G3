package main.java.tasks.string;

public class Log {

    String newCountAttempt;

    public void log(String log) {

        String ipAttempt = log.replaceAll(log.substring(0, 22), "");
        System.out.println(ipAttempt);
        String[] ipAttemptArray = ipAttempt.split("\n");
        String[][] ipAttemptCountArray = new String[ipAttemptArray.length][3];

        int count = 0;
        for (int i = 0; i < ipAttemptArray.length; i++) {

            for (int d = 0; d < ipAttemptCountArray.length; d++) {

                if (ipAttemptArray[i].substring(0, 13).equals(ipAttemptCountArray[d][0])) { //если есть совпадение, то будем увеличивать количество попыток

                    if (ipAttemptArray[i].substring(14, 20).equals("grante")) { //увеличиваем количество успешных попыток
                        if (ipAttemptCountArray[d][1] == null) {
                            String countAttempt = "0";
                            countAttemptParse(countAttempt);
                            ipAttemptCountArray[d][1] = newCountAttempt;
                        } else {
                            String countAttempt = ipAttemptCountArray[d][1];
                            countAttemptParse(countAttempt);
                            ipAttemptCountArray[d][1] = newCountAttempt;
                        }
                    } else {   //увеличиваем количество неуспешных попыток
                        if (ipAttemptCountArray[d][2] == null) {
                            String countAttempt = "0";
                            countAttemptParse(countAttempt);
                            ipAttemptCountArray[d][2] = newCountAttempt;
                        } else {
                            String countAttempt = ipAttemptCountArray[d][2];
                            countAttemptParse(countAttempt);
                            ipAttemptCountArray[d][2] = newCountAttempt;
                        }
                    }
                    break;

                } else { //2.если такого id нету, то будем заполнять в массив

                    if (ipAttemptCountArray[d][0] == null) {
                        if (ipAttemptArray[i].substring(14, 20).equals("grante")) {
                            ipAttemptCountArray[d][0] = ipAttemptArray[i].substring(0, 13);
                            ipAttemptCountArray[d][1] = "1";
                            ipAttemptCountArray[d][2] = "0";
                            count = count + 1;
                        } else {
                            ipAttemptCountArray[d][0] = ipAttemptArray[i].substring(0, 13);
                            ipAttemptCountArray[d][1] = "0";
                            ipAttemptCountArray[d][2] = "1";
                            count = count + 1;
                        }
                        break;

                    }
                }
            }
        }

        for (int e = 0; e < count; e++) {
            System.out.println("ip " + ipAttemptCountArray[e][0] + ": " + "ok - " + ipAttemptCountArray[e][1] + ", failed - " + ipAttemptCountArray[e][2]);
        }
    }

    public String countAttemptParse(String countAttempt) {
        Integer intCountAttempt = Integer.valueOf(countAttempt);
        intCountAttempt = intCountAttempt + 1;
        String newcountAttempt = String.valueOf(intCountAttempt);
        this.newCountAttempt = newcountAttempt;
        return newCountAttempt;
    }
}






