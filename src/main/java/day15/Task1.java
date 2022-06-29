package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/shoes.csv");
        File file2 = new File("src/main/resources/missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter pw = new PrintWriter(file2);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(";");
                if (line.length != 3) {
                    throw new IOException();
                }
                if (Integer.parseInt(line[2]) == 0 ) {
                    pw.println(line[0] + ", " + line[1] + ", " + line[2]);
                }
            }

            scanner.close();
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный формат файла");
        }

    }
}
