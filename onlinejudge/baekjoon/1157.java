import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final String word = scan.next().toUpperCase();

        final Map<Character, Integer> result = new HashMap<>();

        int max = 0;
        for (final char alphabet : word.toCharArray()) {
            final int count = result.getOrDefault(alphabet, 0);
            result.put(alphabet, count + 1);
            if (result.get(alphabet) > max) {
                max = result.get(alphabet);
            }
        }

        int count = 0;
        char answer = '?';
        for (final var entry : result.entrySet()) {
            if (entry.getValue() == max) {
                count++;
                answer = entry.getKey();
            }
        }

        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println(answer);
        }
    }

}
