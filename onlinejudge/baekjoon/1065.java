import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n < 100) {
            System.out.println(n);
            return;
        }

        int answer = 99;

        for (int i = 100; i <= n; i++) {
            String[] temp = String.valueOf(i).split("");
            boolean isHansu = true;
            for (int j = 1; j < temp.length; j++) {
                int firstGap = Integer.valueOf(temp[1]) - Integer.valueOf(temp[0]);

                int before = Integer.valueOf(temp[j - 1]);
                int next = Integer.valueOf(temp[j]);

                if (next - before != firstGap) {
                    isHansu = false;
                    break;
                }
            }
            if (isHansu) {
                answer += 1;
            }
        }

        System.out.println(answer);

    }
}

