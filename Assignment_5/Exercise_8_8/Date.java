public class Date {
    // date (1-31), month (1-12), year
    private int month, day, year;
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {
        // month must be 1-12
        if (month <= 0 || month > 12) {throw new IllegalArgumentException("month (" + month + ") must be 1-12");}
        
        // day must not exceed max days for that month
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        // leap year check
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        // year must be 1000-9999
        if (year < 1000 || year > 9999) {throw new IllegalArgumentException("year (" + year + ") must be 1000-1999");}

        this.day = day;
        this.month = month;
        this.year = year;
        //System.out.printf("Date object constructor for date %s%n", this);
    }

    public void nextDay() {
        // leap year check
        int maxDays = (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) ? 29 : daysPerMonth[month];
        
        day = (day % maxDays) + 1;
        // increment month
        if (day == 1) {
            month = (month % 12) + 1;
            if (month == 1)
                year++;
        }
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}