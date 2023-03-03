import java.util.*;
import java.util.Random;

import javax.lang.model.util.ElementScanner6;

class Task2NumberGuessingGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String play = "YES";
        while (play.equals("YES")) {
            Random rand = new Random();
            int num = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            while (guess != num) {
                System.out.println("Guess a number between 1 and 100");
                guess = sc.nextInt();
                tries++;

                if (guess == num) {
                    System.out.println("Correct guess !");
                    System.out.println("Tries : " + tries);
                    System.out.println("PLAY AGAIN ? YES OR NO : ");
                    play = sc.next().toUpperCase();
                } else if (guess > num)
                    System.out.println("Guess lower");
                else
                    System.out.println("Guess higher");
            }
        }
    }
}