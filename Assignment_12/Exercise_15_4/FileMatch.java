import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileMatch {
    public static void main(String[] args) throws IOException {
        Path oldMaster = Paths.get("oldmast.txt");
        Path transactions = Paths.get("trans.txt");
        Path newMaster = Paths.get("newmast.txt");
        Path logFile = Paths.get("log.txt");

        List<TransactionRecord> transactionList = new ArrayList<>();

        // loads all transactions into a list
        try (Scanner transScanner = new Scanner(Files.newBufferedReader(transactions))) {
            while(transScanner.hasNext()) {
                int accountNumber = transScanner.nextInt();
                double amount = transScanner.nextDouble();
                transactionList.add(new TransactionRecord(accountNumber, amount));
            }
        }

        Set<Integer> matchedTransactions = new HashSet<>();

        try (
            Scanner masterScanner = new Scanner(Files.newBufferedReader(oldMaster));
            BufferedWriter newMasterWriter = Files.newBufferedWriter(newMaster);
            BufferedWriter logWriter = Files.newBufferedWriter(logFile);
        ) {
            while (masterScanner.hasNext()) {
                int accountNumber = masterScanner.nextInt();
                String firstName = masterScanner.next();
                String lastName = masterScanner.next();
                double balnce = masterScanner.nextDouble();

                Account account = new Account(accountNumber, firstName, lastName, balnce);

                for (TransactionRecord t : transactionList) {
                    if (t.getAccountNumber() == accountNumber) {
                        account.combine(t);
                        matchedTransactions.add(accountNumber);
                    }
                }

                newMasterWriter.write(account.toString());
                newMasterWriter.newLine();
            }

            for (TransactionRecord t : transactionList) {
                if (!matchedTransactions.contains(t.getAccountNumber())) {
                    logWriter.write("Unmatched transaction record for account number " + t.getAccountNumber());
                    logWriter.newLine();
                }
            }
        }
        System.out.println("File matching complete.");
    }
}
