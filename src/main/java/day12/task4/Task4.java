package day12.task4;

import day12.task5.MusicArtist;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Иванов");
        members1.add("Петров");
        MusicBand mb1 = new MusicBand("A", 2000, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Федоров");
        members2.add("Никитин");
        MusicBand mb2 = new MusicBand("B", 1960, members2);



        mb1.printMembers();
        mb2.printMembers();

        MusicBand.transferMembers(mb1, mb2);

        mb1.printMembers();
        mb2.printMembers();

    }


}

