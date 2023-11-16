

import java.util.Scanner;

public class Main {

    static int n;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        int[] tower = new int[n];
        for (int i = 0; i < n; i++) {
            tower[i] = scan.nextInt();
        }

        int answer = Math.max(tower[0], tower[n - 1]);

        for (int i = 1; i < n - 1; i++) {
            int minHeightBetweenTarget = Math.min(tower[i - 1], tower[i + 1]);
            int max = tower[i] + minHeightBetweenTarget;
            answer = Math.max(answer, max);
        }

        System.out.println(answer);
    }
}