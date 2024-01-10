import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] dishes = scan.next().toCharArray();

        int count = 10;
        for (int i = 1; i < dishes.length; i++) {
            char before = dishes[i - 1];
            char after = dishes[i];

            if (before != after) {
                count += 10;
            } else {
                count += 5;
            }
        }

        System.out.println(count);

    }
}
