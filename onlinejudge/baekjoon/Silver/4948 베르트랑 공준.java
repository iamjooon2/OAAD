import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int count = 0;
            for (int i = n + 1; i < 2 * n + 1; i++) {
                if (isPrime(i)) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < (int) (Math.sqrt(n)) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}