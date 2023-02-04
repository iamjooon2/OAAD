import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.remove();
            int a = queue.remove();
            queue.add(a);
        }

        System.out.println(((LinkedList<Integer>) queue).get(0));
    }
}