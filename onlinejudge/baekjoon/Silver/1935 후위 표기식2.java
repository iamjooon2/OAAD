import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static final char A = 'A';
    private static final char Z = 'Z';
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        double[] arr = new double[n];

        String str = scan.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Stack<Double> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= A && str.charAt(i) <= Z) {
                stack.push(arr[str.charAt(i) - A]);
            }
            if (str.charAt(i) == MULTIPLY) {
                double temp1 = stack.pop();
                double temp2 = stack.pop();
                stack.push(temp2 * temp1);
            }
            if (str.charAt(i) == PLUS) {
                double temp1 = stack.pop();
                double temp2 = stack.pop();
                stack.push(temp2 + temp1);
            }
            if (str.charAt(i) == MINUS) {
                double temp1 = stack.pop();
                double temp2 = stack.pop();
                stack.push(temp2 - temp1);
            }
            if (str.charAt(i) == DIVIDE) {
                double temp1 = stack.pop();
                double temp2 = stack.pop();
                stack.push(temp2 / temp1);
            }
        }
        double ans = stack.pop();
        System.out.print(String.format("%.2f", ans));
    }
}