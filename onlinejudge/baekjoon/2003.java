import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    static int N;
    static int S;
    static int[] ARR;

    public static void main(String[] args) {
        initialize();

        int sum = 0;
        int left = 0;
        int right = 0;
        int count = 0;

        // 최대 개수 안에서.. 돌린다
        while (right <= N) {
            if (sum >= S) {
                sum -= ARR[left++];
            } else if (sum < S) {
                sum += ARR[right++];
            }
            if (sum == S) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static void initialize() {
        N = scan.nextInt();
        S = scan.nextInt();
        ARR = new int[N + 1];

        for (int i = 0; i < N; i++) {
            ARR[i] = scan.nextInt();
        }
    }
}

