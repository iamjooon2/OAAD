import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine(); // 개행문자도 라인으로 쳐서 안됨... 제거용 라인 파싱

        for (int i = 1; i <= N; i++) {
            String line = scan.nextLine();
            System.out.println(String.format("%d. %s", i, line));
        }
    }
}
