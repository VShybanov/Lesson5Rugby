import java.util.Random;

public class Lesson5Rugby {
    static final int PLAYERS_NUMBER = 25;
    static final int MIN_PLAYER_AGE = 18;
    static final int MAX_PLAYER_AGE = 40;
    public static void main(String[] args) {
        int[] team1Age = new int[PLAYERS_NUMBER];
        int[] team2Age = new int[PLAYERS_NUMBER];
        Random rnd = new Random();
        int arvAge = 0;
        System.out.println("Дві команди регбі по " + PLAYERS_NUMBER + " гравців у кожній віком від " + MIN_PLAYER_AGE
                + " до " + MAX_PLAYER_AGE + " років.");

        System.out.print("Вік гравців команди № 1: ");
        for (int i = 0; i < team1Age.length; i++) {
            team1Age[i] = rnd.nextInt(MAX_PLAYER_AGE - MIN_PLAYER_AGE + 1) + MIN_PLAYER_AGE;
            System.out.print(team1Age[i]);
            arvAge += team1Age[i];
            if (i < team1Age.length - 1)
                System.out.print(", ");
        }
        arvAge = arvAge / PLAYERS_NUMBER;
        System.out.println("\nСередній вік гравців команди № 1 - " + arvAge);

        arvAge = 0;
        System.out.print("Вік гравців команди № 2: ");
        for (int i = 0; i < team2Age.length; i++) {
            team2Age[i] = rnd.nextInt(MAX_PLAYER_AGE - MIN_PLAYER_AGE + 1) + MIN_PLAYER_AGE;
            System.out.print(team2Age[i]);
            arvAge += team2Age[i];
            if (i < team2Age.length - 1)
                System.out.print(", ");
        }
        arvAge = arvAge / PLAYERS_NUMBER;
        System.out.println("\nСередній вік гравців команди № 2 - " + arvAge);
    }
}
