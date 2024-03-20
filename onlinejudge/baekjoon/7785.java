import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String, Boolean> map = new LinkedHashMap<>();

        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String[] arr = scan.nextLine().split(" ");
            String name = arr[0];
            if (!map.containsKey(name)) {
                map.put(name, Boolean.TRUE);
            } else {
                map.remove(name);
            }
        }

        List<String> arr = new ArrayList<>(map.keySet());

        Collections.sort(arr, Collections.reverseOrder());

        for (String a : arr) {
            System.out.println(a);
        }

    }
}
