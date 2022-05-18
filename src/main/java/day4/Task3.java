package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        int maxString = 0;
        int maxStringId = 0;

        for (int i = 0; i < 12; i++) {
            int sum = 0;
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + " ");

            }
            if (sum > maxString) {
                maxString = sum;
                maxStringId = i;
            }
            System.out.print(" = "+sum +"\n");

        }
        System.out.println(maxStringId);

    }
}
 