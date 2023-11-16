import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            int m = scan.nextInt();
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < m; j++) {
                scan.next();
                String where = scan.next();

                if (map.containsKey(where)) {
                    map.put(where, map.get(where) + 1);
                } else {
                    map.put(where, 1);
                }
            }

            int result = 1;
            for (int value : map.values()) {
                result = result * (value + 1);
            }

            System.out.println(result - 1);
        }
    }
}
