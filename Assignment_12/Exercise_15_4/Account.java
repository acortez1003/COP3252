public class Account {
    private int accountNumber;
    private String firstName, lastName;
    private double balance;

    public Account() {this(0, "", "", 0.0);}

    public Account(int accountNumber, String firstName, String lastName, double balance) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getAccountNumber() {return accountNumber;}

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {return balance;}

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void combine(TransactionRecord record) {
        this.balance += record.getAmount();
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.2f", accountNumber, firstName, lastName, balance);
    }
}
