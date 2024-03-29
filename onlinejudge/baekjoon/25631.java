import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        Map<Integer, Integer> dolls = new HashMap<>();

        for (int i = 0; i < N; i++) {
            final int size = scanner.nextInt();
            final int nextSize = dolls.getOrDefault(size, 0);
            
            dolls.put(size, nextSize + 1);
        }

        int answer = 0;
        for (final var entry : dolls.entrySet()) {
            answer = Math.max(answer, entry.getValue());
        }

        System.out.println(answer);
    }

}
