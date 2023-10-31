import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] pies = new int[n];
        for (int i = 0; i < n; i++) {
            pies[i] = scan.nextInt();
        }

        // 누적합 구하기
        int[] sums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + pies[i - 1];
        }

        // 구간의 최대 합 구하기
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i + k <= n) {
                max = Math.max(max, sums[i + k] - sums[i]);
            } else {
                max = Math.max(max, sums[n] - sums[i] + sums[(i + k) % n]);
            }
        }

        System.out.println(max);
    }
}
