import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int num1, num2, num3, sum, average, product, smallest, largest;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first int: ");
        num1 = input.nextInt();
        System.out.print("Enter second int: ");
        num2 = input.nextInt();
        System.out.print("Enter third int: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = (num1 + num2 + num3) / 3;
        product = num1 * num2 * num3;

        largest = num1;
        smallest = num1;
        if(num2 > largest)
            largest = num2;
        if(num2 < smallest)
            smallest = num2;
        if(num3 > largest)
            largest = num3;
        if(num3 < smallest)
            smallest = num3;
        
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);

        input.close();
    }
}