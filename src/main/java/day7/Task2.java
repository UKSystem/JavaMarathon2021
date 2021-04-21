package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int staminaStartScore = 0;

        Random random = new Random();

        staminaStartScore = random.nextInt(10) + 90;
        Player player1 = new Player(staminaStartScore);
        staminaStartScore = random.nextInt(10) + 90;
        Player player2 = new Player(staminaStartScore);
        staminaStartScore = random.nextInt(10) + 90;
        Player player3 = new Player(staminaStartScore);
        staminaStartScore = random.nextInt(10) + 90;
        Player player4 = new Player(staminaStartScore);
        staminaStartScore = random.nextInt(10) + 90;
        Player player5 = new Player(staminaStartScore);
        staminaStartScore = random.nextInt(10) + 90;
        Player player6 = new Player(staminaStartScore);

        Player.info();
        System.out.println("Игроков на поле: " + Player.getCountPlayers());

        staminaStartScore = random.nextInt(10) + 90;
        Player player7 = new Player(staminaStartScore);
        staminaStartScore = random.nextInt(10) + 90;
        Player player8 = new Player(staminaStartScore);

        System.out.println("Игроков на поле: " + Player.getCountPlayers());

        for (int i = 0; i < Player.MAX_STAMINA; i++) {
            player1.run();
        }

        Player.info();
        System.out.println("Игроков на поле: " + Player.getCountPlayers());

    }
}