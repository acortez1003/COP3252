import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Collections;

public class ListSort {
    private static final SecureRandom randomNum = new SecureRandom();
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 25; i++) {
            int num = randomNum.nextInt(101);
            list.add(num);
        }

        LinkedList<Integer> listCopy = new LinkedList<>(list);

        Collections.sort(list);

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        double average = (double) sum / list.size();

        System.out.println("Before sort: " + listCopy);
        System.out.println("Sorted list: " + list);
        System.out.println("Sum\t = " + sum);
        System.out.println("Average\t = " + average);
    }
}
