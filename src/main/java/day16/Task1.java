package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("randomNumbers");
        printResult(file);

    }

    public static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);
            String[] s = sc.nextLine().split(" ");

            int sum = 0;
            for (String value : s) {
                sum += Integer.parseInt(value);
            }
            double d = (double) sum / s.length;

            System.out.printf(d + " --> " + "%.3f", d);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

