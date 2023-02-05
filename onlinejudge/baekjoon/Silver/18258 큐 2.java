import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static final String PUSH = "push";
    private static final String POP = "pop";
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
        Queue<String> queue = new LinkedList<>();
        String back = null;
        for (int i = 0; i < n; i++) {
            String[] line = bufferedReader.readLine().split(BLANK);

            if (line[0].equals(PUSH)) {
                queue.add(line[1]);
                back = line[1];
            }
            if (line[0].equals(POP)) {
                if (queue.size() == ZERO) {
                    bufferedWriter.write(NEGATIVE + ESCAPE_SEQUENCE);
                } else {
                    String front = queue.poll();
                    bufferedWriter.write(front + ESCAPE_SEQUENCE);
                }
            }
            if (line[0].equals(SIZE)) {
                int queueSize = queue.size();
                bufferedWriter.write(queueSize + ESCAPE_SEQUENCE);
            }
            if (line[0].equals(EMPTY)) {
                if (queue.size() == ZERO) {
                    bufferedWriter.write(POSITIVE + ESCAPE_SEQUENCE);
                } else {
                    bufferedWriter.write(ZERO + ESCAPE_SEQUENCE);
                }
            }
            if (line[0].equals(FRONT)) {
                if (queue.size() == ZERO) {
                    bufferedWriter.write(NEGATIVE + ESCAPE_SEQUENCE);
                } else {
                    String front = queue.peek();
                    bufferedWriter.write(front + ESCAPE_SEQUENCE);
                }
            }
            if (line[0].equals(BACK)) {
                if (queue.size() == ZERO) {
                    bufferedWriter.write(NEGATIVE + ESCAPE_SEQUENCE);
                } else {
                    bufferedWriter.write(back + ESCAPE_SEQUENCE);
                }
            }
        }
        bufferedWriter.close();
    }
}