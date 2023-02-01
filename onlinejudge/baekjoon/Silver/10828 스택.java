import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static final String BLANK = " ";
    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String TOP = "top";
    private static final int POSITIVE = 1;
    private static final int ZERO = 0;
    private static final int NEGATIVE = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] line = bf.readLine().split(BLANK);

            if (line[0].equals(PUSH)) {
                stack.push(line[1]);
            }
            if (line[0].equals(POP)) {
                if (stack.size() == ZERO) {
                    System.out.println(-1);
                } else {
                    System.out.println(Integer.parseInt(stack.pop()));
                }
            }
            if (line[0].equals(SIZE)) {
                int stackSize = stack.size();
                System.out.println(stackSize);
            }
            if (line[0].equals(EMPTY)) {
                if (stack.size() == ZERO) {
                    System.out.println(POSITIVE);
                } else {
                    System.out.println(ZERO);
                }
            }
            if (line[0].equals(TOP)) {
                if (stack.size() == ZERO) {
                    System.out.println(NEGATIVE);
                } else {
                    String top = stack.peek();
                    System.out.println(Integer.parseInt(top));
                }
            }
        }
    }
}