import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] arr;
    static int[] targets;

    public static void main(String[] args) {
        initialize();

        Arrays.sort(arr);

        printResult();
    }

    private static void printResult() {
        for (int target : targets) {
            if (haveTargetByBinarySearch(target)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static boolean haveTargetByBinarySearch(int target) {
        int start = 0;
        int end = N - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }


    private static void initialize() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        M = scan.nextInt();
        targets = new int[M];
        for (int i = 0; i < M; i++) {
            targets[i] = scan.nextInt();
        }
    }
}