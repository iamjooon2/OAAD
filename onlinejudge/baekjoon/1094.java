import java.util.Scanner;

public class Main {
    static int[] bars = {64, 32, 16, 8, 4, 2, 1};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();

        int count = 0;
        for (int bar : bars) {
            if (X >= bar) {
                count++;
                X = X - bar;
            }

            if (X == 0) {
                break;
            }
        }

        System.out.println(count);

    }
}
