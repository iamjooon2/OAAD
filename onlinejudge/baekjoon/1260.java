package main.boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1260 {

    static final Scanner scan = new Scanner(System.in);

    static int N;
    static int M;
    static int V;
    static List<List<Integer>> adjacencyList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        N = scan.nextInt();
        M = scan.nextInt();
        V = scan.nextInt();

        visited = new boolean[N + 1];
        adjacencyList.add(new ArrayList<>());
        for (int i = 0; i < N + 1; i += 1) {
            adjacencyList.add(new LinkedList<>());
        }

        for (int i = 0; i < M; i += 1) {
            int current = scan.nextInt();
            int next = scan.nextInt();

            adjacencyList.get(current).add(next);
            adjacencyList.get(next).add(current);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(adjacencyList.get(i));
        }
        
        dfs(V);

        System.out.println();
        for (int j = 0; j < visited.length; j += 1) {
            visited[j] = false;
        }

        bfs(V);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            visited[now] = true;

            System.out.print(now + " ");

            for (int adj : adjacencyList.get(now)) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.offer(adj);
                }
            }
        }
    }

    private static void dfs(int node) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;

        System.out.print(node + " ");

        for (int element : adjacencyList.get(node)) {
            if (!visited[element]) {
                dfs(element);
            }
        }
    }
}
