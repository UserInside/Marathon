package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int players = 8; // <== ввести количество игроков
        Player[] team = new Player[players];

        for (int i = 0; i < team.length; i++) {
            team[i] = new Player(random.nextInt(11) + 90);
        }

        Player.info();
        for (Player p : team) {
            while (p.getStamina() > Player.MIN_STAMINA) {
                p.run();
            }
            Player.info();
        }


    }
}
