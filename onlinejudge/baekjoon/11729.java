import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

    static int N;
    
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        printMoves();

        recursive(N, 1, 3, 2);
        bw.flush();
    }

    private static void printMoves() throws IOException {
        // 2^n - 1 개의 움직임만 있으면 됨
        BigInteger value = BigInteger.valueOf(2)
                .pow(N)
                .subtract(BigInteger.ONE);
        bw.write(value.toString() + "\n");
    }

    private static void recursive(int count, int source, int target, int temp) throws IOException {
        if (count == 1) {
            bw.write(source + " " + target + "\n");
            return;
        }
        recursive(count - 1, source, temp, target);
        bw.write(source + " " + target + "\n");
        recursive(count - 1, temp, target, source);
    }
}
