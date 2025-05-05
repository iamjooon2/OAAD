import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N;
    static int[] arr;
    static int[] answer = new int[2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i += 1) {
            arr[i] = sc.nextInt();
        }

        int leftIndex = 0;
        int rightIndex = N - 1;

        int abs = Math.abs(arr[leftIndex] + arr[rightIndex]);
        while (leftIndex < rightIndex) {
            int sum = arr[leftIndex] + arr[rightIndex];
            int tempAbs = Math.abs(sum);

            if (tempAbs < abs) {
                answer[0] = arr[leftIndex];
                answer[1] = arr[rightIndex];

                abs = tempAbs;
            }

            if (sum < 0) {
                leftIndex += 1;
            } else {
                rightIndex -= 1;
            }
        }

        System.out.println(answer[0] + " " + answer[1]);
    }
}
