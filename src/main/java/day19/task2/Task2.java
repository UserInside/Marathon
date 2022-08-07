package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/taxi_cars.txt");
        Scanner scanner = new Scanner(file);

        Map<Integer, Point> cars = new HashMap<>();

        while (scanner.hasNextLine()) {
            String[] s = scanner.nextLine().split(" ");

            Point point = new Point(Integer.parseInt(s[1]), Integer.parseInt(s[2]));

            cars.put(Integer.parseInt(s[0]), point);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Введите четыре числа");

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int counter = 0;

        for (Map.Entry<Integer, Point> car : cars.entrySet()) {
            if (car.getValue().getX() > x1 && car.getValue().getY() > y1
                    && car.getValue().getX() < x2 && car.getValue().getY() < y2) {
                System.out.println("Машина номер " + car.getKey() + " внутри квадрата");
                counter += 1;
            }
        }
        System.out.println();
        System.out.println("Всего внутри квадрата " + counter + " машин");

    }
}

