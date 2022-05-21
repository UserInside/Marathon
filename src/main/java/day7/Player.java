package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA && countPlayers > 0) {
                countPlayers--;
            }
        }
    }

    public static void info() {

        int vacants = 6 - countPlayers;
        if (vacants > 0) {
            switch (vacants) {
                case 5:
                case 6:
                    System.out.println("Команды неполные. На поле есть еще " + vacants +
                            " свободных мест");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Команды неполные. На поле есть еще " + vacants +
                            " свободных места");
                    break;
                case 1:
                    System.out.println("Команды неполные. На поле есть еще " + vacants +
                            " свободное место");
                    break;
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
