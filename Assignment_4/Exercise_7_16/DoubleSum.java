public class DoubleSum {
    public static void main(String[] args) {
        double result = 0;
        for (String num : args) {
            double val = Double.parseDouble(num);
            result += val;
        }
        System.out.printf("Total sum is: %f", result);
    }    
}