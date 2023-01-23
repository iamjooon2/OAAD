import java.util.Scanner;
/*
    어떠한 수 N이 1이 될 때 까지 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다.
    단, 두 번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다

    1. N에서 1을 뺀다.
    2. N을 K로 나눈다.

    예를 들어 N이 17, K가 4라고 가정하자. 이때 1번의 과정을 한 번 수행하면 N은 16이 된다.
    이후에 2번의 과정을 두 번 수해앟면 N은 1이 된다
    결과적으로 이 경우 전체 과정을 실행한 횟수는 3이 되고, 이는 N을 1로 만드는 최소 횟수이다.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int result = 0;

        while (n >= k) {
            while (n % k != 0) {
                n -= 1;
                result += 1;
            }
            n /= k;
            result += 1;
        }
        
        while (n > 1) {
            n -= 1;
            result += 1;
        }

        System.out.println(result);
    }
}