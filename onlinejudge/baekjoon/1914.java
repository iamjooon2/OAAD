import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static int N;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        // 1개 전처리
        if (N == 1) {
            System.out.println(1);
            System.out.println("1 3");
            return;
        }

        // 20개 미만일때 이동 출력
        if (N <= 20) {
            printMoves();
            recursive(BigInteger.valueOf(N), 1, 3, 2);
            return;
        }

        printMoves();
    }

    private static void printMoves() {
        // 2^n - 1 개의 움직임만 있으면 됨
        BigInteger value = BigInteger.valueOf(2).pow(N).subtract(BigInteger.ONE);
        System.out.println(value);
    }

    private static void recursive(BigInteger total, int source, int target, int temp) {
        if (total.equals(BigInteger.ONE)) {
            System.out.println(source + " " + target);
            return;
        }
        recursive(total.subtract(BigInteger.valueOf(1)), source, temp, target);
        System.out.println(source + " " + target);
        recursive(total.subtract(BigInteger.valueOf(1)), temp, target, source);
    }

}