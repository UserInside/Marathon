package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>(Arrays.asList(new MusicArtist(
                "Иванов", 55), new MusicArtist("Петров", 33)));

        MusicBand mb1 = new MusicBand("A", 2000, members1);

        List<MusicArtist> members2 = new ArrayList<>(Arrays.asList(new MusicArtist(
                "Федоров", 44), new MusicArtist("Никитин", 22)));
        MusicBand mb2 = new MusicBand("B", 1960, members2);


        mb1.printMembers();
        mb2.printMembers();

        MusicBand.transferMembers(mb1, mb2);

        mb1.printMembers();
        mb2.printMembers();
    }


}
