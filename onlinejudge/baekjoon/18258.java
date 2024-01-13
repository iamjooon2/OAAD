import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        var bf = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();
        var sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        for (int i = 0; i < N; i += 1) {
            String[] command = bf.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    queue.add(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        int temp = queue.get(0);
                        queue.remove(queue.get(0));
                        sb.append(temp).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.get(0)).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.get(queue.size() - 1)).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
