package main.boj;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BOJ_24482 {

    static final Scanner scan = new Scanner(System.in);

    static int N;
    static int M;
    static int R;
    static List[] adjacencyList;
    static int[] depth;

    public static void main(String[] args) {
        N = scan.nextInt();
        M = scan.nextInt();
        R = scan.nextInt();

        depth = new int[N + 1];
        Arrays.fill(depth, -1);

        adjacencyList = new List[N + 1];
        for (int i = 0; i <= N; i += 1) {
            adjacencyList[i] = new LinkedList<>();
            depth[i] = -1;
        }

        for (int i = 0; i < M; i += 1) {
            int start = scan.nextInt();
            int end = scan.nextInt();

            adjacencyList[start].add(end);
            adjacencyList[end].add(start);
        }

        for (List<Integer> list : adjacencyList) {
            Collections.sort(list, Collections.reverseOrder());
        }

        dfs(R, 0);
        for (int i = 1; i <= N; i++) {
            System.out.println(depth[i]);
        }
    }

    private static void dfs(int index, int count) {
        depth[index] = count;

        for (Object obj : adjacencyList[index]) {
            int number = (Integer) obj;
            if (depth[number] == -1) {
                dfs(number, count + 1);
            }
        }
    }
}

