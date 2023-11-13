import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int jimin = scan.nextInt();
        int hansu = scan.nextInt();

        int count = 0;
        while (true) {
            jimin = jimin / 2 + jimin % 2;
            hansu = hansu / 2 + hansu % 2;
            count++;
            if (jimin == hansu) {
                break;
            }
        }

        System.out.println(count);

    }
}
