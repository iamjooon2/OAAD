import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    static int H;
    static int W;
    static int X;
    static int Y;
    static int[][] ARR_A;
    static int[][] ARR_B;

    public static void main(String[] args) {
        initialize();
        recover();
        printAnswer();
    }

    private static void initialize() {
        H = scan.nextInt();
        W = scan.nextInt();
        X = scan.nextInt();
        Y = scan.nextInt();

        ARR_A = new int[H][W];
        ARR_B = new int[H + X][W + Y];
        for (int i = 0; i < H + X; i++) {
            for (int j = 0; j < W + Y; j++) {
                ARR_B[i][j] = scan.nextInt();
            }
        }
    }

    private static void recover() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i >= X && j >= Y) {
                    ARR_A[i][j] = ARR_B[i][j] - ARR_A[i - X][j - Y];
                } else {
                    ARR_A[i][j] = ARR_B[i][j];
                }
            }
        }
    }

    private static void printAnswer() {
        for (int[] line : ARR_A) {
            for (int element : line) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
