public class Employee extends Object{
    private final String firstName, lastName, socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getSocialSecurityNumber() {return socialSecurityNumber;}

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s", "employee", getFirstName(), getLastName(), "social security number", getSocialSecurityNumber());
    }
}