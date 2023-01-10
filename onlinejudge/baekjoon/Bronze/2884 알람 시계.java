import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        if (minute < 45) {
            if (hour == 0) {
                System.out.printf("%d %d", 23, minute + 15);
            } else {
                System.out.printf("%d %d", hour - 1, minute + 15);
            }
        } else {
            System.out.printf("%d %d", hour, minute - 45);
        }
    }
}
