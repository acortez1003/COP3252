public class HourlyEmployee extends Employee{
    private double hours, wage;

    HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        setHours(hours);
        setWage(wage);
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be 0-168");
        }
        this.hours = hours;
    }
    public double getHours() {return hours;}

    public void setWage(double wage) {
        if (hours < 0) {
            throw new IllegalArgumentException("Wage must be nonnegative");
        }
        this.wage = wage;
    }
    public double getWage() {return wage;}

    public double earnings() {
        if (hours <= 40) {
            return getHours() * getWage();
        } else {    // overtime
            return (40 * getWage()) + ((getHours() - 40) * (1.5 * getWage()));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f%n%s: %.2f",
                            "hourly", super.toString(), "hours", getHours(), "wage", getWage());
    }
}
