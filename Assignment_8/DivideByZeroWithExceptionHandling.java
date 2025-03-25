import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        int numerator = 0, denominator = 0, result;

        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                denominator = scanner.nextInt();

                result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n%n", numerator, denominator, result);
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                scanner.nextLine(); //discards input so user can try again
                System.out.printf("You must enter integers. Please try again.%n%n");

            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Oops, can't do that.%nZero is an invalid denominator. Please try again.%n%n");
            } finally {
                System.out.printf("Numerator is %d%nDenominator is: %d%n%n", numerator, denominator);

            }
        } while (continueLoop);
        scanner.close();
    }
}