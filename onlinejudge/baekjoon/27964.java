import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int count = scan.nextInt();

        final Map<String, Integer> chesseMap = new HashMap<>();

        for (int i = 0; i < count; i++) {
            final String cheese = scan.next();

            if (!cheese.endsWith("Cheese")) {
                continue;
            }

            if (chesseMap.containsKey(cheese)) {
                chesseMap.put(cheese, chesseMap.get(cheese) + 1);
            } else {
                chesseMap.put(cheese, 1);
            }
        }

        if (chesseMap.size() > 3) {
            System.out.println("yummy");
        } else {
            System.out.println("sad");
        }
    }
}