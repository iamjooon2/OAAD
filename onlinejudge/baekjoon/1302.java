import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> result = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            String input = scan.next();
            if (result.containsKey(input)) {
                result.put(input, result.get(input) + 1);
            } else {
                result.put(input, 1);
            }
        }

        String answer = null;
        int max = 0;
        for (var entry : result.entrySet()) {
            if (entry.getValue() > max) {
                answer = entry.getKey();
                max = entry.getValue();
            } else if (entry.getValue() == max) {
                List<String> list = new ArrayList<>();
                list.add(answer);
                list.add(entry.getKey());
                Collections.sort(list);
                answer = list.get(0);
            }
        }
        System.out.println(answer);
    }
}
