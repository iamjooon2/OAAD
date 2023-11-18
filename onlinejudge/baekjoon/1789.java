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
        while(true) {
            if (s < n) {
                break;
            }
            s -= n;
            n++;
        }
        
        System.out.println(n - 1);
    }
}
