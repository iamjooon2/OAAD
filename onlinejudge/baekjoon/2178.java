import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        scan.nextLine();

        initialize(scan);

        bfs();

        System.out.println(map[n - 1][m - 1]);
    }

    private static void initialize(Scanner scan) {
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visit[i][j] = false;
            }
        }
        // 시작점
        visit[0][0] = true;
    }

    private static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(1, 1));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < dx.length; i++) {
                int nextX = node.x + dx[i];
                int nextY = node.y + dy[i];

                if (1 <= nextX && nextX <= n && 1 <= nextY && nextY <= m) {
                    if (map[nextX - 1][nextY - 1] == 1 && visit[nextX - 1][nextY - 1] == false) {
                        queue.add(new Node(nextX, nextY));
                        visit[nextX - 1][nextY - 1] = true;
                        // 이동하기 전 칸의 정보를 넣어준다
                        // 현재 칸까지 오기까지 몇번 이동해야했는지 알 수 있음
                        map[nextX - 1][nextY - 1] += map[node.x - 1][node.y - 1];
                    }
                }
            }
        }
    }

    static class Node {

        final int x;
        final int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
