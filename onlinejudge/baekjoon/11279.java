package main.boj;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_11279 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int N = scan.nextInt();

        for (int i = 0; i < N; i += 1) {
            int input = scan.nextInt();

            if (input != 0) {
                queue.offer(input);
                continue;
            }

            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                int poll = queue.poll();
                System.out.println(poll);
            }
        }
    }
}
