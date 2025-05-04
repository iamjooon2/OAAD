import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i += 1) {
            queue.add(i);
        }

        int index = 0;
        int[] arr = new int[N];
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i += 1) {
                int value = queue.poll();
                queue.offer(value);
            }
            arr[index] = queue.poll();
            index++;
        }

        System.out.println(Arrays.toString(arr)
                .replace("[", "<")
                .replace("]", ">"));
    }

}
