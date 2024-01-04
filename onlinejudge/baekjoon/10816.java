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
        br.readLine();

        for (String element : br.readLine().split(" ")) {
            int input = Integer.parseInt(element);
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        br.readLine();
        var sb = new StringBuilder();
        for (String target : br.readLine().split(" ")) {
            int input = Integer.parseInt(target);
            sb.append(map.getOrDefault(input, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
