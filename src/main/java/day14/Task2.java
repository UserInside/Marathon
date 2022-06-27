package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("peopl1e.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<String> list = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String x = scanner.nextLine();
                if (Integer.parseInt(x.split(" ")[1]) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");

                    }
                    return null;
                } else {
                    list.add(x);
                }
            }
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }
}
