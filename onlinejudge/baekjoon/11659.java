package main.boj;

import java.util.Scanner;

public class BOJ_11659 {

    private static Scanner SCAN = new Scanner(System.in);

    static int N;
    static int M;
    static int[] arr;
    static long[] sum;

    public static void main(String[] args) {
        N = SCAN.nextInt();
        M = SCAN.nextInt();

        arr = new int[N];
        sum = new long[N + 1];

        // zero-padding for array sum
        sum[0] = 0;
        sum[1] = arr[0];
        for (int i = 0; i < N; i += 1) {
            arr[i] = SCAN.nextInt();
            sum[i + 1] = sum[i] + arr[i];
        }

        for (int i = 0; i < M; i += 1) {
            int start = SCAN.nextInt();
            int end = SCAN.nextInt();

            if (start == end) {
                System.out.println(arr[start - 1]);
            } else {
                System.out.println(sum[end] - sum[start - 1]);
            }
        }
    }
}
