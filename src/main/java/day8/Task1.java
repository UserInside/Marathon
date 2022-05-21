package day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            numbers += i + " ";
        }
        System.out.println(numbers);
        long stopTime1 = System.currentTimeMillis();
        int time1 = (int) (stopTime1 - startTime1);


        StringBuilder sb = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long stopTime2 = System.currentTimeMillis();
        int time2 = (int) (stopTime2 - startTime2);

        System.out.println("Длительность работы, в мс.: " + time1);
        System.out.println("Длительность работы, в мс.: " + time2);


    }

}
