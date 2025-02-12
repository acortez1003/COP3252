

public class Sales {
    public static void main(String[] args) {
        int[] salesArray = {5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, 6000};
        int[] salaryRanges = new int[9];    // 9 groups
        int salary, index;

        for (int sales : salesArray) {
            salary = (int) ((sales * 0.09) + 200);

            if (salary >= 1000) {
                salaryRanges[8]++;
            } else {
                // lowest salary we can have is 200, so subtract 200
                // need first digit ($300 - 200 = 100 --> 100/100 = 1, goes into salaryRanges[1])
                index = (salary - 200) / 100;
                salaryRanges[index]++;
            }
        }

        System.out.println("---SALARY DISTRIBUTION---");
        String[] ranges = {"$200-299", "$300-399", "$400-499", "$500-599", "$600-699", "$700-799",
                           "$800-899", "$900-999", "$1,000 and over"};

        for (int i = 0; i < salaryRanges.length; i++) {
            System.out.printf("%-20s: %d%n", ranges[i], salaryRanges[i]);
        }
    }
}
