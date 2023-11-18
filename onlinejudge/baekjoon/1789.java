import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static long s;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        s = scan.nextLong();

        int n = 1;
        while (true) {
            if (s < n) {
                break;
            }
            s -= n;
            n++;
        }
        
        System.out.println(n - 1);
    }
    // 1부터 s까지 더하니 시간초과...!
    // s가 42억 가량의 long 범위이기 때문에
    // s에서 1을 시작으로 점진적으로 빼줘야 함
}
