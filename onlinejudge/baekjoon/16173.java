import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int n;
    static int[][] map;
    static boolean[][] visited;
    static boolean isMovable = false;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        initialize();
        bfs();
        printResult();
    }

    private static void initialize() throws IOException {
        var bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = bf.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }
    }

    private static void bfs() {
        queue.add(new int[]{0, 0});
        while (!queue.isEmpty()) {
            var jelly = queue.poll();
            int x = jelly[0];
            int y = jelly[1];

            if (visited[x][y]) {
                continue;
            }
            visited[x][y] = true;

            int moves = map[x][y];
            if (moves == -1) {
                isMovable = true;
                break;
            }

            int nextX = x + moves;
            int nextY = y + moves;

            if (nextX >= 0 && nextX < n && !visited[nextX][y]) {
                queue.add(new int[]{nextX, y});
            }
            if (nextY >= 0 && nextY < n && !visited[x][nextY]) {
                queue.add(new int[]{x, nextY});
            }

        }
    }

    private static void printResult() {
        if (isMovable) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }
}