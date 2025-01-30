import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        int largest, smallest;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first int: ");
        num1 = input.nextInt();

        System.out.print("Enter second int: ");
        num2 = input.nextInt();

        System.out.print("Enter third int: ");
        num3 = input.nextInt();

        System.out.print("Enter fourth int: ");
        num4 = input.nextInt();

        System.out.print("Enter fifth int: ");
        num5 = input.nextInt();

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
        if(num4 > largest)
            largest = num4;
        if(num4 < smallest)
            smallest = num4;
        if(num5 > largest)
            largest = num5;
        if(num5 < smallest)
            smallest = num5;

        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The smallest number is: %d%n", smallest);
        input.close();
    }
}
