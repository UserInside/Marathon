package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        Map<String, Integer> words = new HashMap<>();

        while (scanner.hasNext()) {

            String s = scanner.next();

            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }
        scanner.close();

        // TODO отсортировать карту по значениям

        int counter = 0;
        while (counter != 100) {
            int maxWordValue = 0;
            for (Map.Entry<String, Integer> word : words.entrySet()) {
                if (word.getValue() > maxWordValue) {
                    maxWordValue = word.getValue();
                }
            }

            for (Map.Entry<String, Integer> word : words.entrySet()) {
                if (word.getValue() == maxWordValue) {
                    System.out.println(word);
                    word.setValue(0);
                }
            }


            counter++;
        }

        //Чичиков - 601
    }
}
