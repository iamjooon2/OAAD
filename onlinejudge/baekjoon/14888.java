import java.util.Scanner;

public class BOJ_14888 {

    static final Scanner scan = new Scanner(System.in);

    static int N; // 숫자 개수
    static int[] operators = new int[4]; // 연산자 개수
    static int[] nums; // 숫자
    static int MAX = Integer.MAX_VALUE + 1;
    static int MIN = Integer.MIN_VALUE - 1;

    public static void main(String[] args) {
        N = scan.nextInt();
        nums = new int[N];
        for (int i = 0; i < N; i += 1) {
            nums[i] = scan.nextInt();
        }

        for (int i = 0; i < 4; i += 1) {
            operators[i] = scan.nextInt();
        }

        dfs(nums[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void dfs(int num, int index) {
        if (index == N) {
            MAX = Math.max(num, MAX);
            MIN = Math.min(num, MIN);
            return;
        }

        for (int i = 0; i < 4; i += 1) {
            // 연산자 개수가 1개 이상이면
            if (operators[i] > 0) {
                // 연산자 하나 감소시키기
                operators[i]--;

                switch (i) {
                    case 0:
                        dfs(num + nums[index], index + 1);
                        break;
                    case 1:
                        dfs(num - nums[index], index + 1);
                        break;
                    case 2:
                        dfs(num * nums[index], index + 1);
                        break;
                    case 3:
                        dfs(num / nums[index], index + 1);
                        break;
                }
                // 재귀 종료시 연산자 개수 복구
                operators[i]++;
            }
        }
    }
}
