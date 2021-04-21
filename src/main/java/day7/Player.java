package day7;

public class Player {

    private int stamina;

    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;                    // текущее количество играков на поле
    private static int maxPlayers = 6;                      // максимальное количество играков на поле
    private static int reservePlayers = 0;                  // текущее количество игроков в резерве с выносливостью > 0

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < maxPlayers) countPlayers++;
        else reservePlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina != MIN_STAMINA) {
            stamina -= 1;
            if (stamina == MIN_STAMINA) countPlayers--;
        }
    }

    public static void info() {
        if (maxPlayers - countPlayers == 0) System.out.println("На поле нет свободных мест");
        else if (maxPlayers - countPlayers == 1)
            System.out.println("Команды неполные. На поле еще есть " + (maxPlayers - countPlayers) + " свободное место, а в резерве " + reservePlayers);
        else
            System.out.println("Команды неполные. На поле еще есть " + (maxPlayers - countPlayers) + " свободных места, а в резерве " + reservePlayers);
    }
}