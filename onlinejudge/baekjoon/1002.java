import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {

            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int r1 = scan.nextInt();

            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int r2 = scan.nextInt();

            System.out.println(generateResult(x1, y1, r1, x2, y2, r2));
        }
    }

    private static int generateResult(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // 중점 같으면서 반지름도 같을 때
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        // 내접하거나 외접할 때
        if (distance == Math.pow(r2 - r1, 2) || distance == Math.pow(r1 + r2, 2)) {
            return 1;
        }

        // 원 안에 원으로 만나지 않거나 아예 멀리 있을 때
        if (distance > Math.pow(r1 + r2, 2) || distance < Math.pow(r2 - r1, 2)) {
            return 0;
        }

        return 2;
    }

}
