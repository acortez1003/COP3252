import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        char[] tokens = input.toCharArray();

        for (char letter : tokens) {
            if (Character.isLetter(letter)) {
                map.put(letter, map.getOrDefault(letter, 0) + 1);
            }
        }
    }

    private static void displayMap(Map<Character, Integer> map) {
        Set<Character> keys = map.keySet();

        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (Character key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}
