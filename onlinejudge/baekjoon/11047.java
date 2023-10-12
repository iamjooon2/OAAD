import java.util.*;

public class Main {

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int K = scan.nextInt();

        int count = 0;

        int[] coins = new int[N];
        for (int i = 0; i < N; i += 1) {
            coins[N - i - 1] = scan.nextInt();
        }

        for (int i = 0; i < N; i += 1) {
            final int leftMoney = K % coins[i];
            final int possibleMoney = K - leftMoney;
            final int addCoinCounts = possibleMoney / coins[i];
            count += addCoinCounts;
            K = leftMoney;
            if (K == 0) {
                break;
            }
        }

        System.out.println(count);
    }
}