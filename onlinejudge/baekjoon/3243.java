import java.util.Arrays;
import java.util.Scanner;

public class BOJ_3273 {

    static final Scanner scan = new Scanner(System.in);

    static int N;
    static int[] ARR;
    static int X;

    public static void main(String[] args) {
        N = scan.nextInt();
        ARR = new int[N];
        for (int i = 0; i < N; i += 1) {
            ARR[i] = scan.nextInt();
        }
        X = scan.nextInt();

        Arrays.sort(ARR);

        int start = 0;
        int end = N - 1;
        long count = 0;
        while (start < end) {
            if (ARR[start] + ARR[end] == X) {
                count += 1;
            }
            if (ARR[start] + ARR[end] <= X) {
                start += 1;
            } else {
                end -= 1;
            }
        }

        System.out.println(count);
    }
}
