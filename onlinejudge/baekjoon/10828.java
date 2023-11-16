import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> stacks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String order = br.readLine();

            if (order.contains("push")) {
                int element = Integer.parseInt(order.split(" ")[1]);
                stacks.add(element);
            } else if (order.equals("pop")) {
                if (stacks.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stacks.remove(stacks.size() - 1));
                }
            } else if (order.equals("size")) {
                System.out.println(stacks.size());
            } else if (order.equals("empty")) {
                if (stacks.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (order.equals("top")) {
                if (stacks.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stacks.get(stacks.size() - 1));
                }
            }
        }

    }
}
