package main.boj;

public class BOJ_4673 {

    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 1; i < 10_000; i += 1) {
            int selfNumber = toSelfNumber(i);
            if (selfNumber < 10000) {
                check[selfNumber] = true;
            }
        }

        for (int i = 1; i < 10000; i += 1) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    private static int toSelfNumber(int n) {
        int sum = n;
        while (n > 0) {
            int 자리수 = n % 10;
            sum += 자리수;
            n /= 10;
        }
        return sum;
    }

}
