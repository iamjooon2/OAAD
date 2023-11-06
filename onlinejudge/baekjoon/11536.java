import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static int n;
    static String[] names;
    static String[] sorted;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        names = new String[n];
        sorted = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = scan.next();
            sorted[i] = names[i];
        }

        Arrays.sort(sorted);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (sorted[i].equals(names[i])) {
                count++;
            }
        }

        if (count == n) {
            System.out.println("INCREASING");
            return;
        }

        Arrays.sort(sorted, Comparator.reverseOrder());
        count = 0;
        for (int i = 0; i < n; i++) {
            if (sorted[i].equals(names[i])) {
                count++;
            }
        }

        if (count == n) {
            System.out.println("DECREASING");
            return;
        }

        System.out.println("NEITHER");
    }
}
