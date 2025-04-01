import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNum = new SecureRandom();
    private int roll1, roll2, sum, point;
    private boolean isFirstRoll;

    public Craps() {
        isFirstRoll = true;
        point = 0;
    }

    public void rollDice() {
        roll1 = randomNum.nextInt(6) + 1;
        roll2 = randomNum.nextInt(6) + 1;
        sum = roll1 + roll2;

        if (isFirstRoll) {
            if (sum == 7 || sum == 11) {
                point = 0;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                point = -1;
            } else  {
                point = sum;
            }
            isFirstRoll = false;
        } else {
            if (sum == 7) {
                point = -1;
            } else if (sum == point) {
                point = 0;
            }
        }

        if (point == 0 || point == -1) {
            isFirstRoll = true;
        }
    }

    public int getRoll1() {return roll1;}
    public int getRoll2() {return roll2;}
    public int getSum() {return sum;}
    public int getPoint() {return point;}
}
