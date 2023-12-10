import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static int N;
    static List<Integer> arr = new ArrayList<>();
    static Map<Integer, Integer> count = new HashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        initialize(scan);

        // 평균
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println((int) Math.round((double) sum / N));

        // 중앙값
        System.out.println(arr.get((N - 1) / 2));

        // 최빈값
        int max = 0;
        for (var counts : count.values()) {
            max = Math.max(counts, max);
        }
        List<Integer> maxes = new ArrayList<>();
        for (var number : count.keySet()) {
            if (count.get(number) == max) {
                maxes.add(number);
            }
        }
        Collections.sort(maxes);

        if (maxes.size() == 1) {
            System.out.println(maxes.get(0));
        } else {
            System.out.println(maxes.get(1));
        }

        // 범위
        System.out.println(arr.get(N - 1) - arr.get(0));
    }

    private static void initialize(Scanner scan) {
        N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int input = scan.nextInt();
            arr.add(input);

            if (count.containsKey(input)) {
                count.put(input, count.get(input) + 1);
            } else {
                count.put(input, 1);
            }

        }
        Collections.sort(arr);
    }
}