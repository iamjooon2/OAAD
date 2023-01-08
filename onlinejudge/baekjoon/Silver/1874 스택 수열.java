import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        Stack<Integer> stack = new Stack<>();

        ArrayList<String> result = new ArrayList<>();

        int i = 1;
        int j = 0;

        while (j < n) {
            if (!stack.isEmpty() && stack.peek() > list.get(j)) {
                System.out.println("NO");
                return;
            }

            if (!stack.isEmpty() && stack.peek().equals(list.get(j))) {
                stack.pop();
                result.add("-");
                j += 1;
                continue;
            }

            stack.push(i);
            result.add("+");
            i += 1;
        }

        for (int k = 0; k < result.size(); k++) {
            System.out.println(result.get(k));
        }
    }
}