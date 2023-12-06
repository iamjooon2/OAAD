import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int m, n, h;
    static int[][][] tomatoes;
    static int days = 0;

    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static Queue<Tomato> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        m = Integer.parseInt(line[0]);
        n = Integer.parseInt(line[1]);
        h = Integer.parseInt(line[2]);

        initialize(br);

        if (areTomatoesAllRipped()) {
            System.out.println(0);
            return;
        }

        bfs();

        if (areTomatoesAllRipped()) {
            System.out.println(days);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean areTomatoesAllRipped() {
        for (int[][] boxes: tomatoes) {
            for (int[] line : boxes) {
                for (int blank : line) {
                    if (blank == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            days = tomato.day;

            for (int i = 0; i < 6; i++) {
                int nextX = tomato.x + dx[i];
                int nextY = tomato.y + dy[i];
                int nextZ = tomato.height + dz[i];

                if (0 <= nextX && nextX < n &&
                        0 <= nextY && nextY < m &&
                        0 <= nextZ && nextZ < h) {
                    if (tomatoes[nextZ][nextX][nextY] == 0) {
                        tomatoes[nextZ][nextX][nextY] = 1;
                        queue.add(new Tomato(nextX, nextY, nextZ, days + 1));
                    }
                }
            }
        }
    }

    private static void initialize(BufferedReader br) throws IOException {
        tomatoes = new int[h][n][m];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                String[] line = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    tomatoes[i][j][k] = Integer.parseInt(line[k]);
                    if (tomatoes[i][j][k] == 1) {
                        queue.add(new Tomato(j, k, i, 0));
                    }
                }
            }
        }
    }

    static class Tomato {

        final int x;
        final int y;
        final int height;
        final int day;

        Tomato(int x, int y, int height, int day) {
            this.x = x;
            this.y = y;
            this.height = height;
            this.day = day;
        }
    }
}