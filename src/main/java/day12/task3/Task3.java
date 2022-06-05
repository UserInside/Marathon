package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Rammstein", 1992));
        bands.add(new MusicBand("Pink floyd", 1960));
        bands.add(new MusicBand("Korn", 2002));
        bands.add(new MusicBand("SOAD", 2003));
        bands.add(new MusicBand("Slipknot", 2008));
        bands.add(new MusicBand("Stone sour", 1980));
        bands.add(new MusicBand("Deep Purple", 1930));
        bands.add(new MusicBand("Led Zeppelin", 1976));
        bands.add(new MusicBand("Avantasia", 2001));
        bands.add(new MusicBand("Бурановский бабушки", 2013));

        Collections.shuffle(bands);

        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> after2000 = new ArrayList<>();
        for(MusicBand x : bands) {
            if (x.year > 2000) after2000.add(x);
        }
        return after2000;


    }


}
