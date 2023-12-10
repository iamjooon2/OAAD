import java.util.Scanner;

public class Main {

    static int count = 0;

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        for (int i = 0; i < scan.nextInt(); i++) {
            String target = scan.next();
            System.out.println(isPalindrome(target) + " " + count);
            count = 0;
        }
    }

    private static int recursion(String input, int left, int right) {
        count += 1;
        if (left >= right) {
            return 1;
        } else if (input.charAt(left) != input.charAt(right)) {
            return 0;
        }
        return recursion(input, left + 1, right - 1);
    }

    private static int isPalindrome(String target) {
        return recursion(target, 0, target.length() - 1);
    }
}
