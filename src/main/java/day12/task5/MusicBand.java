package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();

    public void setMember(MusicArtist musicArtist) {
        this.members.add(musicArtist);
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;

        this.members = members;

    }

    public void printMembers() {
        System.out.println("Состав группы " + name + " - " + members);
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand mb1, MusicBand mb2) {
        while (mb1.getMembers().size() > 0) {
            mb2.setMember(mb1.getMembers().remove(0));
        }

    }

}
