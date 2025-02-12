public class Products {
    public static void main(String[] args) {
        System.out.printf("Testing product(5): %d%n", product(5));
        System.out.printf("Testing product(): %d%n", product());
        System.out.printf("Testing product(1, 2, 3): %d%n", product(1, 2, 3));
        System.out.printf("Testing product(3, 4, 12, 2, 11): %d%n", product(3, 4, 12, 2, 11));
    }   
    public static int product(int... nums) {
        int result = 1;
        if (nums.length == 0)
            return 1;
        
        for (int num : nums) {
            result *= num;
        }
        return result;
    } 
}
