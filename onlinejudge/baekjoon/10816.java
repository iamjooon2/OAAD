import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {

    static int N, M;
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        for (String element : split) {
            int input = Integer.parseInt(element);
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        M = Integer.parseInt(br.readLine());

        var sb = new StringBuilder();
        String[] targets = br.readLine().split(" ");

        for (String target : targets) {
            int key = Integer.parseInt(target);
            sb.append(map.getOrDefault(key, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
