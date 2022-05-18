package day4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        int moreThenEightCounter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        int oneCounter = 0;
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for( int i : array) {
            sum += i;
            System.out.println(i);
            if (i > 8) {
                moreThenEightCounter++;
            }
            if (i == 1) {
                oneCounter++;
            }
            if (i % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }

        }
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: "+ moreThenEightCounter);
        System.out.println("Количество чисел равных 1: " + oneCounter);
        System.out.println("Количество четных чисел: " + evenCounter);
        System.out.println("Количество нечетных чисел: " + oddCounter);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
