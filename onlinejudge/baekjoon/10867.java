import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int N = scan.nextInt();
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            numbers.add(scan.nextInt());
        }

        List<Integer> listNumber = new ArrayList<>(numbers);

        Collections.sort(listNumber);

        for (int n : listNumber) {
            System.out.print(n + " ");
        }

    }
}
