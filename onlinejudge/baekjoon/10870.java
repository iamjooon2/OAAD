import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int result = recursive(n - 1);
        System.out.println(result);

    }

    private static int recursive(int n) {
        if (n < 0) {
            return 0;
        }
        if (n <= 1) {
            return 1;
        }
        return recursive(n - 2) + recursive(n - 1);
    }
}
