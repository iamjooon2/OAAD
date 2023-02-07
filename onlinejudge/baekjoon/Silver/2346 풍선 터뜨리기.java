import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    private static final String BLANK = " ";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Deque<Balloon> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.add(new Balloon(i + 1, scan.nextInt()));
        }

        StringBuilder sb = new StringBuilder();

        while (deque.size() > 1) {
            Balloon cur = deque.poll();
            sb.append(cur.idx).append(BLANK);
            int move = cur.num;
            if (move < 0) {
                while (move++ < 0) {
                    deque.addFirst(deque.pollLast());
                }
            } else {
                move -= 1;
                while (move-- > 0) {
                    deque.addLast(deque.pollFirst());
                }
            }
        }

        System.out.println(sb.append((deque.poll()).idx));
    }

    static class Balloon {
        int idx, num;

        Balloon(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }
    }
}