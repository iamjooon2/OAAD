import java.util.Scanner;

public class Main {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        long source = scan.nextLong();
        long target = scan.nextLong();

        if (source == target) {
            System.out.println(0);
            return;
        }

        if (source > target) {
            long tmp = target;
            target = source;
            source = tmp;
        }

        System.out.println(target - source - 1);
        for (long i = source + 1; i < target; i += 1) {
            System.out.print(i + " ");
        }
    }
}
