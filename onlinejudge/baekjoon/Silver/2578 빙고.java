import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] table = new int[5][5];
        int bingoCount = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = scan.nextInt();
            }
        }

        for (int count = 1; count <= 25; count++) {
            int answer = scan.nextInt();

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (table[i][j] == answer) {
                        table[i][j] = 0;
                    }
                }
            }

            bingoCount += checkVertical(table);
            bingoCount += checkHorizontal(table);
            bingoCount += checkRightUpDiagonal(table);
            bingoCount += checkRightDownDiagonal(table);

            if (bingoCount >= 3) {
                System.out.println(count);
                break;
            }
            bingoCount = 0;
        }
    }

    public static int checkVertical(int[][] table) {
        int bingoCount = 0;
        for (int i = 0; i < 5; i++) {
            int zeroCount = 0;
            for (int j = 0; j < 5; j++) {
                if (table[i][j] == 0) {
                    zeroCount += 1;
                }
                if (zeroCount == 5) {
                    bingoCount += 1;
                }
            }
        }
        return bingoCount;
    }

    public static int checkHorizontal(int[][] table) {
        int bingoCount = 0;
        for (int i = 0; i < 5; i++) {
            int zeroCount = 0;
            for (int j = 0; j < 5; j++) {
                if (table[j][i] == 0) {
                    zeroCount += 1;
                }
                if (zeroCount == 5) {
                    bingoCount += 1;
                }
            }
        }
        return bingoCount;
    }

    public static int checkRightUpDiagonal(int[][] table) {
        int bingoCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < 5; i++) {
            if (table[i][i] == 0) {
                zeroCount += 1;
            }
        }
        if (zeroCount == 5) {
            bingoCount += 1;
        }
        return bingoCount;
    }

    public static int checkRightDownDiagonal(int[][] table) {
        int bingoCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < 5; i++) {
            if (table[i][4 - i] == 0) {
                zeroCount += 1;
            }
        }
        if (zeroCount == 5) {
            bingoCount += 1;
        }
        return bingoCount;
    }
}
