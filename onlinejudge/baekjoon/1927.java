import java.util.*;

public class Main {
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i += 1) {
            int input = scan.nextInt();
            if (input == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(input);
            }

        }
    }
}
