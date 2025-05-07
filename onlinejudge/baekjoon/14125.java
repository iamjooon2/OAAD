package main.boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_14215 {

    static final Scanner scan = new Scanner(System.in);
    static final int[] arr = new int[3];

    public static void main(String[] args) {
        for (int i = 0; i < 3; i += 1) {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        if (arr[0] + arr[1] > arr[2]) {
            System.out.println(arr[0] + arr[1] + arr[2]);
        } else {
            System.out.println((arr[0] + arr[1]) * 2 - 1);
        }
    }
}

