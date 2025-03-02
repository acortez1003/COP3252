public class DateAndTimeTest {
    public static void main(String[] args) {
        DateAndTime dateTime = new DateAndTime(12, 31, 2024, 23, 59, 58);

        System.out.printf("Initial time: %s%n", dateTime);

        for (int i = 0; i < 5; i++) {
            dateTime.tick();
            System.out.printf("After tick: %s%n", dateTime);
        }

        dateTime.incrementHour();
        System.out.printf("After incrementing hour: %s%n", dateTime);
    }
}