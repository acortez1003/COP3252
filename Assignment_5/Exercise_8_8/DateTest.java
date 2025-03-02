public class DateTest {
    public static void main(String[] args) {
        System.out.println("Increment to next month test");
        Date date = new Date(5, 28, 2014);
        System.out.printf("%s%n", date.toString());
        for (int i = 0; i < 5; i++) {
            date.nextDay();
            System.out.printf("--> %s%n", date.toString());
        }

        System.out.printf("%nIncrement to next year test%n");
        Date date2 = new Date(12, 28, 2024);
        System.out.printf("%s%n", date2.toString());
        for (int i = 0; i < 5; i++) {
            date2.nextDay();
            System.out.printf("--> %s%n", date2.toString());
        }
    }
}