import java.io.*;
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
    private static final String ESCAPE_SEQUENCE = "\n";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] line = bufferedReader.readLine().split(BLANK);

            if (line[0].equals(PUSH)) {
                stack.push(line[1]);
            }
            if (line[0].equals(POP)) {
                if (stack.size() == ZERO) {
                    bufferedWriter.write(NEGATIVE + ESCAPE_SEQUENCE);
                } else {
                    bufferedWriter.write(Integer.parseInt(stack.pop()) + ESCAPE_SEQUENCE);
                }
            }
            if (line[0].equals(SIZE)) {
                int stackSize = stack.size();
                bufferedWriter.write(stackSize + ESCAPE_SEQUENCE);
            }
            if (line[0].equals(EMPTY)) {
                if (stack.size() == ZERO) {
                    bufferedWriter.write(POSITIVE + ESCAPE_SEQUENCE);
                } else {
                    bufferedWriter.write(ZERO + ESCAPE_SEQUENCE);
                }
            }
            if (line[0].equals(TOP)) {
                if (stack.size() == ZERO) {
                    bufferedWriter.write(NEGATIVE + ESCAPE_SEQUENCE);
                } else {
                    String top = stack.peek();
                    bufferedWriter.write(Integer.parseInt(top) + ESCAPE_SEQUENCE);
                }
            }
        }
        bufferedWriter.close();
    }
}