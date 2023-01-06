import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            queue.add(i + 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while (queue.size() > 1) {
            for (int i = 0; i < b - 1; i++) {
                int value = queue.poll();
                queue.offer(value);
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append(">");
        System.out.println(sb);

    }

}