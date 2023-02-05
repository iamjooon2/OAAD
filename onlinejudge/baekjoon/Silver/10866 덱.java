import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static final String PUSH_FRONT = "push_front";
    private static final String PUSH_BACK = "push_back";
    private static final String POP_FRONT = "pop_front";
    private static final String POP_BACK = "pop_back";

    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";
    private static final String BACK = "back";
    private static final String BLANK = " ";
    private static final int POSITIVE = 1;
    private static final int ZERO = 0;
    private static final int NEGATIVE = -1;
    private static final String ESCAPE_SEQUENCE = "\n";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        Deque<String> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] line = bufferedReader.readLine().split(BLANK);

            if (line[0].equals(PUSH_FRONT)) {
                deque.offerFirst(line[1]);
            }
            if (line[0].equals(PUSH_BACK)) {
                deque.offerLast(line[1]);
            }
            if (line[0].equals(POP_FRONT)) {
                if (deque.size() == ZERO) {
                    bufferedWriter.write(NEGATIVE + ESCAPE_SEQUENCE);
                } else {
                    String front = deque.pollFirst();
                    bufferedWriter.write(front + ESCAPE_SEQUENCE);
                }
            }
            if (line[0].equals(POP_BACK)) {
                if (deque.size() == ZERO) {
                    bufferedWriter.write(NEGATIVE + ESCAPE_SEQUENCE);
                } else {
                    String front = deque.pollLast();
                    bufferedWriter.write(front + ESCAPE_SEQUENCE);
                }
            }
            if (line[0].equals(SIZE)) {
                int queueSize = deque.size();
                bufferedWriter.write(queueSize + ESCAPE_SEQUENCE);
            }
            if (line[0].equals(EMPTY)) {
                if (deque.size() == ZERO) {
                    bufferedWriter.write(POSITIVE + ESCAPE_SEQUENCE);
                } else {
                    bufferedWriter.write(ZERO + ESCAPE_SEQUENCE);
                }
            }
            if (line[0].equals(FRONT)) {
                if (deque.size() == ZERO) {
                    bufferedWriter.write(NEGATIVE + ESCAPE_SEQUENCE);
                } else {
                    String front = deque.peekFirst();
                    bufferedWriter.write(front + ESCAPE_SEQUENCE);
                }
            }
            if (line[0].equals(BACK)) {
                if (deque.size() == ZERO) {
                    bufferedWriter.write(NEGATIVE + ESCAPE_SEQUENCE);
                } else {
                    String back = deque.peekLast();
                    bufferedWriter.write(back + ESCAPE_SEQUENCE);
                }
            }
        }
        bufferedWriter.close();
    }
}