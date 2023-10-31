import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            int number = scan.nextInt();
            if (number == 0) {
                System.out.println(String.format("Case #%d: INSOMNIA", i));
                continue;
            }

            int count = 1;
            Map<String, Integer> map = new HashMap<>();
            while (true) {
                int target = number * count;
                String[] temp = String.valueOf(target).split("");

                for (String word : temp) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
                if (map.size() == 10) {
                    System.out.println(String.format("Case #%d: %d", i, target));
                    break;
                }
                count += 1;
            }
        }
    }
}
