public class Time2Test {
    public static void main(String[] args) {
        Time2 time = new Time2(12, 34, 59);
        displayTime("Time", time);
        time.tick();
        displayTime("Tick second", time);
        System.out.println();

        Time2 time2 = new Time2(11, 59, 30);
        displayTime("Time", time2);
        time2.incrementMinute();
        displayTime("Tick minute", time2);
        System.out.println();

        Time2 time3 = new Time2(23, 05, 00);
        displayTime("Time", time3);
        time3.incrementHour();
        displayTime("Tick hour", time3);
    }

    private static void displayTime(String header, Time2 t) {
        System.out.printf("%-15s: %s%n", header, t.toUniversalString());
    }
}
