import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            String stars = "*".repeat(2 * i - 1);
            String blank = " ".repeat(n - i);
            System.out.println(blank + stars + blank);
        }
    }

}
