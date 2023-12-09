import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();


        Long result = recursive(n);
        System.out.println(result);

    }

    private static Long recursive(Long n) {
        if (n == 0 || n == 1L) {
            return 1L;
        }
        return n * recursive(n - 1);
    }
}