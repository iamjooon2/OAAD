import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int count = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                count = n / 5 + count;
                break;
            }
            n -= 2;
            count += 1;
        }
        if (n > 0) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}