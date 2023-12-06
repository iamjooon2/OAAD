import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int m;
    static int n;
    static int[][] box;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int day = 0;

    static Queue<Tomato> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        n = scan.nextInt();

        box = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = scan.nextInt();
                if (box[i][j] == 1) {
                    queue.offer(new Tomato(i, j, 0));
                }
            }
        }

        bfs();

        if (areAllTomatoesRipe()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean areAllTomatoesRipe() {
        for (int[] line : box) {
            for (int block : line) {
                // 덜익은 토마토 확인
                if (block == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();
            day = tomato.day;

            for (int i = 0; i < 4; i++) {
                int nx = tomato.x + dx[i];
                int ny = tomato.y + dy[i];

                // 상하좌우 경계에서 벗어나진 않았는지 확인
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        queue.add(new Tomato(nx, ny, day + 1));
                    }
                }
            }
        }
    }

    static class Tomato {

        final int x;
        final int y;
        final int day;

        public Tomato(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }

    }
}
