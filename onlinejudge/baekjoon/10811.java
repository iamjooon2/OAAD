import java.util.Scanner;

public class Main {

    static int N;
    static int M;
    static String[][] leftBoard;
    static String[][] rightBoard;

    public static void main(String[] args) {
        initialize();
        solve();
        printAnswer();
    }

    private static void printAnswer() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M / 2; j++) {
                System.out.print(leftBoard[i][j]);
            }
            for (int j = 0; j < M / 2; j++) {
                System.out.print(rightBoard[i][j]);
            }
            System.out.println();
        }
    }

    private static void solve() {
        int mid = M / 2;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < mid; j++) {
                if (!leftBoard[i][j].equals(".")) {
                    rightBoard[i][mid - j - 1] = leftBoard[i][j];
                }
                if (!rightBoard[i][j].equals(".")) {
                    leftBoard[i][mid - j - 1] = rightBoard[i][j];
                }
            }
        }
    }

    private static void initialize() {
        var scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        leftBoard = new String[N][M / 2];
        rightBoard = new String[N][M / 2];

        scan.nextLine();

        for (int i = 0; i < N; i++) {
            String line = scan.nextLine();
            String[] elements = line.split("");
            for (int j = 0; j < line.length() / 2; j++) {
                leftBoard[i][j] = elements[j];
            }
            for (int j = 0; j < line.length() / 2; j++) {
                rightBoard[i][j] = elements[j + (M / 2)];
            }
        }
    }
}
