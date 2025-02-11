import java.security.SecureRandom;
import java.util.Scanner;

public class Guess {
    private static final SecureRandom randomNum = new SecureRandom();
    public static void main(String[] args) {
        int target, guess, playAgain;
        boolean isPlaying = true, correctGuess;
        Scanner input = new Scanner(System.in);

        do {
            correctGuess = false;
            target = randomNum.nextInt(1000) + 1;
            System.out.printf("secret number: %d%n", target);
            while(!correctGuess) {
                System.out.print("Guess a number between 1 and 1000\n>> ");
                guess = input.nextInt();

                if(guess == target) {
                    System.out.println("Congratulations. You guessed the number!");
                    correctGuess = true;

                    System.out.print("Do you want to play again?\n1. Yes\n2. No\n>> ");
                    playAgain = input.nextInt();
                    if (playAgain == 2)
                        isPlaying = false;
                } else if (guess > target) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Too low. Try again.");
                }
            }
        } while(isPlaying);
        System.out.println("Goodbye.");
        input.close();
    }
}