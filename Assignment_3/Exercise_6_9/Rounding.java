import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        double num, numRounded;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("Enter a decimal to round (enter -1 to exit): ");
            num = input.nextDouble();
            numRounded = Math.floor(num + 0.5);
            System.out.printf("Original: %.2f, Rounded: %.0f%n", num, numRounded);

        } while(num != -1);
        System.out.println("Goodbye.");
        input.close();
    }
}