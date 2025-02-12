import java.security.SecureRandom;

public class Two_D_Array {
    public static void main(String[] args) {
        SecureRandom randomNum = new SecureRandom();

        int[][] array = new int[6][4];

        // fill first 5 rows and first 3 columns with random ints
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = randomNum.nextInt(10);
            }
        }
        
        // calculate sums of first 5 rows
        // and store them into their respective fourth column (j = 3)
        for (int i = 0; i < 5; i++) {
            int rowSum = 0;
            // first three columns
            for(int j = 0; j < 3; j++) {
                rowSum += array[i][j];
            }
            array[i][3] = rowSum;
        }

        // calculate sums of first 3 columns
        // storing them into respective row (i = 5)
        for (int j = 0; j < 3; j++) {
            int columnSum = 0;
            for(int i = 0; i < 5; i++) {
                columnSum += array[i][j];
            }
            array[5][j] = columnSum;
        }

        // setting lower right cell to 0
        array[5][3] = 0;

        // print out 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d%-5s", array[i][j], " ");
            }
            System.out.println();
        }
    }
}
