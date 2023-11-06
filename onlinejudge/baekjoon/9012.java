import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int n;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String singleLine = scan.next();
            String[] line = singleLine.split("");

            for (String block : line) {
                if (stack.isEmpty()) {
                    stack.push(block);
                } else if (block.equals("(")) {
                    stack.push(block);
                } else {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            stack.clear();
        }

    }
}
