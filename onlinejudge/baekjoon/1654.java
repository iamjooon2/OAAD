import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int K, N;
    static int[] LINES;
    static long max = -1;

    public static void main(String[] args) throws IOException {
        initialize();

        max += 1;

        long min = 0;
        while (min < max) {
            long mid = (max + min) / 2;

            long count = 0;
            // 구해진 중간 길이로 잘라서 총 몇 개가 만들어지는지 구한다.
            for (int i = 0; i < K; i++) {
                count += (LINES[i] / mid);
            }

            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }

    private static void initialize() throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        K = Integer.parseInt(input[0]);
        N = Integer.parseInt(input[1]);

        br.readLine();
        LINES = new int[K];
        for (int i = 0; i < K; i++) {
            LINES[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, LINES[i]);
        }
    }
}
