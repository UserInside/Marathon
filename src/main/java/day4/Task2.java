package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int biggest = 0;
        int lowest = 10000;
        int lastZeroCounter = 0;
        int lastZeroSum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        for (int i : array) {
            if (i > biggest) {
                biggest = i;
            }
            if (i < lowest) {
                lowest = i;
            }
            if (i % 10 == 0) {
                lastZeroCounter++;
                lastZeroSum += i;
            }
        }
        System.out.println(biggest + "\n" + lowest + "\n" + lastZeroCounter + "\n" + lastZeroSum);

    }
}
