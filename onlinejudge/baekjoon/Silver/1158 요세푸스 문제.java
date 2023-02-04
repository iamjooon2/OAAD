import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static final String INIT = "<";
    private static final String COMMA = ", ";
    private static final String END = ">";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        Queue<Integer> permutation = new LinkedList<>();
        String answer = INIT;

        for (int i = 0; i < n; i++) {
            permutation.add(i);
        }

        while (permutation.size() != 0) {
            for (int i = 0; i < k - 1; i++) {
                int number = permutation.remove();
                permutation.add(number);
            }
            answer += permutation.poll() + 1 + COMMA;
        }
        System.out.println(answer.substring(0, answer.length() - 2) + END);
    }

}