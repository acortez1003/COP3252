import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NameSearch {
    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first names (type 'done' to finish):");

        while (true) {
            System.out.print("> ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            if (!name.isEmpty()) {
                nameSet.add(name);
            }
        }

        System.out.println("\nNames entered:");
        for (String name : nameSet) {
            System.out.println(name);
        }

        System.out.print("\nEnter a name to search: ");
        String search = scanner.nextLine().trim();

        if (nameSet.contains(search)) {
            System.out.println(search + " was found.");
        } else {
            System.out.println(search + " was not found.");
        }
        scanner.close();
    }
}