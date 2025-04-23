import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class DuplicateWords {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        int numDuplicates = getDuplicates(myMap);
        System.out.printf("%nThere are %d duplicate words.", numDuplicates);
    }

    private static int getDuplicates(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String cleaned = input.replaceAll("[^a-zA-Z ]", "");
        String[] tokens = cleaned.split("\\s+");

        int dupCount = 0;

        for (String token : tokens) {
            String word = token.toLowerCase();
            if (word.isEmpty()) continue;
        
            int count = map.getOrDefault(word, 0);
            if (count == 1) {
                dupCount++;
            }
            map.put(word, count + 1);
        }        
        return dupCount;
    }
}
