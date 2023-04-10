import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[][] map = new char[n][n];
        char[][] status = new char[n][n];

        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            String x = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = x.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            String x = br.readLine();
            for (int j = 0; j < n; j++) {
                status[i][j] = x.charAt(j);
                answer[i][j] = 0;
            }
        }

        calculateBombCount(n, map, answer);

        if (validateLose(status, map, n)) {
            loserView(n, map, status, answer);
        } else {
            winnerView(n, map, status, answer);
        }
    }

    private static void calculateBombCount(final int n, final char[][] map, final int[][] answer) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '*') {
                    // 직선
                    calculateStraight(n, answer, i, j);
                    // 대각선
                    calculateDiagonal(n, answer, i, j);
                }
            }
        }
    }

    private static void calculateDiagonal(final int n, final int[][] answer, final int i, final int j) {
        if (i - 1 >= 0 && j - 1 >= 0) {
            answer[i - 1][j - 1] += 1;
        }
        if (i - 1 >= 0 && j + 1 < n) {
            answer[i - 1][j + 1] += 1;
        }
        if (i + 1 < n && j - 1 >= 0) {
            answer[i + 1][j - 1] += 1;
        }
        if (i + 1 < n && j + 1 < n) {
            answer[i + 1][j + 1] += 1;
        }
    }

    private static void calculateStraight(final int n, final int[][] answer, final int i, final int j) {
        if (i - 1 >= 0) {
            answer[i - 1][j] += 1;
        }
        if (i + 1 < n) {
            answer[i + 1][j] += 1;
        }
        if (j - 1 >= 0) {
            answer[i][j - 1] += 1;
        }
        if (j + 1 < n) {
            answer[i][j + 1] += 1;
        }
    }

    private static boolean validateLose(final char[][] status, final char[][] map, final int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (status[i][j] == 'x' && map[i][j] == '*') {
                    return true;
                }
            }
        }
        return false;
    }

    private static void loserView(final int n, final char[][] map, final char[][] status, final int[][] answer) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '*') {
                    System.out.print('*');
                } else if (status[i][j] == '.' && map[i][j] == '.') {
                    System.out.print('.');
                } else if (status[i][j] == 'x' && map[i][j] == '.') {
                    System.out.print(answer[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static void winnerView(final int n, final char[][] map, final char[][] status, final int[][] answer) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (status[i][j] == '.') {
                    System.out.print('.');
                } else if (status[i][j] == 'x' && map[i][j] == '.') {
                    System.out.print(answer[i][j]);
                }
            }
            System.out.println();
        }
    }
}
