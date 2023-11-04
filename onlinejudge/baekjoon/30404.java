import java.util.Scanner;

public class Main {

    static int n;
    static int k;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        k = scan.nextInt();

        int count = 0;
        int last = 0;

        for (int i = 0; i < n; i++) {
            int clap = scan.nextInt();
            if (i == 0) {
                last = clap;
            }
            if (last + k < clap) {
                count += 1;
                last = clap;
            }
        }

        System.out.println(count + 1);
    }
}
