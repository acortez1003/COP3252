import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CreateDataFiles {
    public static void main(String[] args) throws IOException {
        Path masterPath = Paths.get("oldmast.txt");
        Path transactionPath = Paths.get("trans.txt");

        List<String> masterLines = List.of(
            "100 Alan Jones 348.17",
            "300 Mary Smith 27.19",
            "500 Sam Sharp 0.00",
            "700 Suzy Green -14.22"
        );

        List<String> transactionLines = List.of(
            "100 27.14",
            "300 62.11",
            "400 100.56",
            "900 82.17"
        );

        Files.write(masterPath, masterLines);
        Files.write(transactionPath, transactionLines);

        System.out.println("Files created.");
    }
}
