package main;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            // 절댓값 체크
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            // 절댓값 동일하다면
            if (abs1 == abs2) {
                // o1이 o2보다 크면 양수 반환
                return o1 > o2 ? 1 : -1;
            }

            //  절댓값 다르면 작은 수 먼저
            return abs1 - abs2;
        });

        int size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            int element = scan.nextInt();

            if (element != 0) {
                pq.add(element);
                continue;
            }
            
            if (!pq.isEmpty()) {
                int value = pq.poll();
                System.out.println(value);
            } else {
                System.out.println(0);
            }
        }
    }
}
