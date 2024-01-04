import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int N, M;
    static int[] cards;

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        cards = new int[N];
        String[] elements = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(elements[i]);
        }

        Arrays.sort(cards);

        var sb = new StringBuilder();
        M = Integer.parseInt(br.readLine());
        for (String element : br.readLine().split(" ")) {
            int input = Integer.parseInt(element);
            int result = binarySearch(input);
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }

    private static int binarySearch(int target) {
        int start = 0;
        int end = N - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (cards[mid] < target) {
                start = mid + 1;
            } else if (cards[mid] > target) {
                end = mid - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
