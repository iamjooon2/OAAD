import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // n까지 세기위한 변수
        int number = 1;
        // 횟수를 세기 위한 변수
        int count = 0;

        while (true) {
            // number가 666을 가지고 있다면 count를 증가시킨다
            if (String.valueOf(number).contains("666")) {
                count += 1;
            }
            // 사용자가 입력한 값 까지 다 세게 된다면, 그때의 number를 출력해준다
            if (count == n) {
                System.out.println(number);
                break;
            }
            number += 1;
        }
    }
}