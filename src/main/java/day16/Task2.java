package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/home/igor/JavaProjects/Marathon/file1.txt");
        File file2 = new File("/home/igor/JavaProjects/Marathon/file2.txt");

        if (file1.createNewFile()) {
            PrintWriter pw = new PrintWriter(file1);
            for (int i = 0; i < 1000; i++) {
                pw.print(Math.random() * 100 + " ");
            }
            pw.close();
        }
        if (file2.createNewFile()) {
            Scanner sc = new Scanner(file1);
            String[] s = sc.nextLine().split(" ");

            PrintWriter pw = new PrintWriter(file2);

            int x = 20;
            for (int i = 0; i < s.length/x; i++){
                double sum = 0;
                for (int j = 0; j < x; j++) {
                    sum += Double.parseDouble(s[(i*x)+j]);
                }
                pw.print(sum / x + " ");

            }

            pw.close();
            sc.close();
        }

        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);
            double sum = 0;
            String[] s = sc.nextLine().split(" ");

            for (String value : s) {
                sum += Double.parseDouble(value);
            }

            System.out.print((int) sum);

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
