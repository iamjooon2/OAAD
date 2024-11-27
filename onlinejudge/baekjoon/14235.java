import java.util.*;

public class Main {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int N = scan.nextInt();

        for (int i = 0; i < N; i += 1) {
            int input = scan.nextInt();
            if (input == 0) {
                if (pq.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                for (int j = 0; j < input; j += 1) {
                    pq.add(scan.nextInt());
                }
            }
        }
    }
}
