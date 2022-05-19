package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int lastZeroCounter = 0;
        int lastZeroSum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            if (i % 10 == 0) {
                lastZeroCounter++;
                lastZeroSum += i;
            }
        }
        System.out.println(max + "\n" + min + "\n" + lastZeroCounter + "\n" + lastZeroSum);

    }
}
