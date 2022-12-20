import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] a = s.split("");
        int zero = 0;
        int one = 0;

        if (a[0].equals("0")) {
            zero += 1;
        } else {
            one += 1;
        }

        for (int i = 1; i < a.length; i += 1) {
            if (!a[i - 1].equals(a[i])) {
                if (a[i].equals("0")) {
                    zero += 1;
                }
                else {
                    one += 1;
                }
            }
        }
        System.out.println(Math.min(zero, one));
    }
}