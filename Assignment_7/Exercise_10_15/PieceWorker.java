public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        setWage(wage);
        setPieces(pieces);
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("wage must be >= 0.0");
        }
        this.wage = wage;
    }
    public double getWage() {return wage;}

    public void setPieces(int pieces) {
        if (pieces < 0) {
            throw new IllegalArgumentException("pieces must be >= 0");
        }
        this.pieces = pieces;
    }
    public int getPieces() {return pieces;}

    @Override
    public double earnings() {return getWage() * getPieces();}

    @Override
    public String toString() {
        return String.format("piece worker: %s%n%s: $%,.2f; %s: %d", super.toString(), "hourly wage", getWage(), "pieces made", getPieces());
    }
}
