import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static int N;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        scan.nextLine();

        int answer = 0;

        for (int i = 0; i < N; i++) {
            Map<String, Integer> count = new HashMap<>();

            String[] input = scan.nextLine().split("");
            count.put(input[0], 1);

            boolean isGroupWord = true;
            for (int j = 1; j < input.length; j++) {
                if (count.get(input[j]) == null) {
                    count.put(input[j], 1);
                } else {
                    if (input[j - 1].equals(input[j])) {
                        count.put(input[j], count.get(input[j]) + 1);
                    } else {
                        isGroupWord = false;
                    }
                }
            }
            if (isGroupWord) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
