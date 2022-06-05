package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Honda");
        list.add("Daihatsu");
        list.add("Mazda");
        list.add("Toyota");
        list.add("Suzuki");

        for (String x : list) {
            System.out.println(x);
        }

        list.add(2, "Bentley");

        list.remove(0);

        System.out.println();

        for (String x : list) {
            System.out.println(x);
        }
    }
}
