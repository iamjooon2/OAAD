import java.util.Scanner;

public class Main {

    static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static final String[] DATE = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int day = 0;
        for (int i = 0; i < x - 1; i++) {
            day += DAYS[i];
        }
        day += y;

        System.out.println(DATE[day % 7]);
    }
}
