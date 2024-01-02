import java.util.Scanner;

public class Main {

    static char[][] BLACK_START = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
    };
    static char[][] WHITE_START = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
    };

    static int N, M;
    static char[][] board;
    static int WHITES = Integer.MAX_VALUE;
    static int BLACKS = Integer.MAX_VALUE;

    public static void main(String[] args) {
        initialize();
        findInSurround();
        System.out.println(Math.min(WHITES, BLACKS));
    }

    private static void findInSurround() {
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j < M - 8; j++) {
                find(i, j);
            }
        }
    }

    private static void find(int widthIndex, int heightIndex) {
        int startWithWhiteCount = 0;
        int startWithBlackCount = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i + heightIndex][j + widthIndex] != WHITE_START[i][j]) {
                    startWithWhiteCount++;
                }
                if (board[i + heightIndex][j + widthIndex] != BLACK_START[i][j]) {
                    startWithBlackCount++;
                }
            }
        }

        WHITES = Math.min(startWithWhiteCount, WHITES);
        BLACKS = Math.min(startWithBlackCount, BLACKS);
    }

    private static void initialize() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            char[] line = scan.next().toCharArray();
            for (int j = 0; j < M; j++) {
                board[i][j] = line[j];
            }
        }
    }
}