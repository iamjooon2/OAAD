import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[100][100];
        
        int count = 0;
        for (int i = 0; i < N; i += 1) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            for (int a = x; a < x + 10; a += 1) {
                for (int b = y; b < y + 10; b += 1) {
                    arr[a][b] = 1;
                }
            }
        }
        
        for (int i = 0; i < 100; i += 1) {
            for (int j = 0; j < 100; j += 1) {
                if (arr[i][j] == 1) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}