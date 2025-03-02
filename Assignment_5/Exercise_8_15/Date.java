public class Date {
    // date (1-31), month (1-12), year
    private int month, day, year;
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Date(int month, int day, int year) {
        setDate(month, day, year);
    }

    public Date(String month, int day, int year) {
        int m = -1;
        for (int i = 1; i <= 12; i++) {
            if (months[i].equalsIgnoreCase(month))
                m = i;
        }
        if (m == -1) {throw new IllegalArgumentException("month (" + month +") is not a valid month name");}
        setDate(m, day, year);
    }

    public Date(int dayOfYear, int year) {
        if (year < 1000 || year > 9999) {
            throw new IllegalArgumentException("year (" + year + ") must be 1000-9999");
        }
        
        int[] daysInMonth = daysPerMonth.clone();
        // if leap year, change 28 to 29
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        if (dayOfYear < 1 || dayOfYear > (isLeapYear(year) ? 366 : 365)) {
            throw new IllegalArgumentException("dayOfYear (" + dayOfYear + ") is out of range for the given year");
        }

        int month = 1;
        while (dayOfYear > daysInMonth[month]) {
            dayOfYear -= daysInMonth[month];
            month++;
        }

        this.month = month;
        this.day = dayOfYear;
        this.year = year;
    }

    public void setDate(int month, int day, int year) {
        if (month <= 0 || month > 12) {throw new IllegalArgumentException("month (" + month + ") must be 1-12");}
        
        // day must not exceed max days for that month
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        // leap year check
        if (month == 2 && day == 29 && isLeapYear(year)) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        // year must be 1000-9999
        if (year < 1000 || year > 9999) {throw new IllegalArgumentException("year (" + year + ") must be 1000-1999");}

        this.day = day;
        this.month = month;
        this.year = year;
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
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            if (i == 2 && isLeapYear(dayOfYear)) {
                dayOfYear += 29;
            } else {
                dayOfYear += daysPerMonth[i];
            }
        }
        return String.format("%d/%d/%d%n%s %d, %d%n%d %d%n", 
                                     month, day, year, months[month], day, year, dayOfYear, year);
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}