public class PayrollSystem {
    public static void main(String[] args) {
        Date currentDate = new Date(5, 18, 2025);
        Employee[] employees = new Employee[5];
        employees[0] = new HourlyEmployee("John", "Doe", "123-45-6789", new Date(5, 10, 2003), 25, 35);
        employees[1] = new SalariedEmployee("Jane", "Smith", "987-65-4321", new Date(4, 20, 2001), 200);
        employees[2] = new CommissionEmployee("Alex", "Johnson", "111-22-3333", new Date(1, 1, 2001), 5000, 0.06);
        employees[3] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", new Date(5, 21, 2005), 6000, 0.04, 300);
        employees[4] = new PieceWorker("Nate", "Williams", "777-77-7777", new Date(6, 18, 2002), 25, 50);

        for (Employee currentEmployee : employees) {
            double earnings = currentEmployee.earnings();
            if (currentEmployee.getBirthDate().getMonth() == currentDate.getMonth()) {
                earnings += 100;
            }
            System.out.printf("%s%n%s%nearnings: $%,.2f%n", "---", currentEmployee.toString(), earnings);
        }
    }
}
