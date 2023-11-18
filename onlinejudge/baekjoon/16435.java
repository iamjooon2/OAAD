import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int n;
    static int s;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        s = scan.nextInt();

        int[] fruits = new int[n];

        for (int i = 0; i < n; i++) {
            fruits[i] = scan.nextInt();
        }
        Arrays.sort(fruits);

        for (int i = 0; i < n; i++) {
            if (s < fruits[i]) {
                break;
            }
            s += 1;
        }

        System.out.println(s);
    }

}
