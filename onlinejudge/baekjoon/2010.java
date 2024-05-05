import java.util.Scanner;

public class Main {

    static int N;
    static int plugs;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            plugs += scan.nextInt();
            plugs -= 1;
        }

        plugs += 1;

        System.out.println(plugs);
    }
}
