public class DateAndTime {
    private Date date;
    private Time2 time;

    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        date = new Date(month, day, year);
        time = new Time2(hour, minute, second);
    }

    public void tick() {
        time.tick();
        if (time.getHour() == 0 && time.getMinute() == 0 && time.getSecond() == 0) {
            date.nextDay();
        }
    }

    public void incrementMinute() {
        time.incrementMinute();
        if (time.getHour() == 0 && time.getMinute() == 0) {
            date.nextDay();
        }
    }

    public void incrementHour() {
        time.incrementHour();
        if (time.getHour() == 0) {
            date.nextDay();
        }
    }

    public String toUniversalString() {
        return date.toString() + " " + time.toUniversalString();
    }

    public String toString() {
        return date.toString() + " " + time.toString();
    }
}