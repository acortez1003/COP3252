public abstract class Employee{
    private final String firstName, lastName, socialSecurityNumber;
    private final Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getSocialSecurityNumber() {return socialSecurityNumber;}
    public Date getBirthDate() {return birthDate;}

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s%nbirth date: %s", getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    }
}