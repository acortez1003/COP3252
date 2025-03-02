public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee("Walter", "Simmons", "999-99-9999", 35, 20);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s %n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Hours is", employee.getHours());
        System.out.printf("%s %.2f%n", "Wage is", employee.getWage());
        employee.setHours(40);
        employee.setWage(25);
        System.out.printf("%n%s:%n%n%s%n", "Updated employee infomration obtained by toString", employee);
    }
}