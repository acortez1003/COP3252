import java.security.SecureRandom;
import java.util.Scanner;

public class CoinToss {
    private enum Coin {HEADS, TAILS};
    private static final SecureRandom randomCoinToss = new SecureRandom();
    private static int headFreq = 0, tailFreq = 0;

    public static void main(String[] args) {
        int choice;
        Coin result;
        Scanner input = new Scanner(System.in);

        do {
            System.out.printf("1: Toss coin\n2: Quit\n>> ");
            choice = input.nextInt();

            if(choice == 1) {
                result = flip();
                switch (result) {
                    case HEADS:
                        System.out.println("Result: HEADS");
                        headFreq++;
                        break;
                    case TAILS:
                        System.out.println("Result: TAILS");
                        tailFreq++;
                        break;
                }
            }
        } while(choice != 2);
        displayResults();
        input.close();
    }

    public static Coin flip() {
        // heads --> 0      tails --> 1
        int side = randomCoinToss.nextInt(2);
        return (side == 0) ? Coin.HEADS : Coin.TAILS;
    }

    public static void displayResults() {
        System.out.printf("%n---RESULTS---%nHeads: %d\tTails: %d", headFreq, tailFreq);
    }
}