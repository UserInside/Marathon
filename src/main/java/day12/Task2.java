package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        addToList(0, 30, list);
        addToList(300, 350, list);

        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static void addToList(int from, int to, ArrayList<Integer> list) {
        for (int i = from; i <= to; i += 2) {
            list.add(i);
        }
    }
}
