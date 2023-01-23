import java.util.Scanner;

/* 숫자 카드 게임
    여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한 장을 뽑는 게임이다
    다만 게임의 룰을 지키며 카드를 뽑아야 하고, 룰은 다음과 같다

    1. 숫자가 쓰인 카드들이 N X M 형태로 놓여 있다. 이때 N은 행의 개수를 의미하며, M은 열의 개수를 의미한다
    2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다
    3. 그다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야한다.
    4. 따라서 처음에 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야 한다

    카드들이 N x M 형태로 놓여 있을 때, 게임의 룰에 맞게 카드를 뽑는 프로그램을 만드시오.

 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int minValue = 10_001;
            for (int j = 0; j < m; j++) {
                int x = scan.nextInt();
                minValue = Math.min(minValue, x);
            }
            result = Math.max(result, minValue);
        }
        
        System.out.println(result);
    }
}