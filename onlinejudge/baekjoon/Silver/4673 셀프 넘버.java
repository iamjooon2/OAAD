public class Main {
    private static final int MAX = 10_001;

    public static void main(String[] args) {
        boolean[] arr = new boolean[MAX];

        for (int i = 1; i < MAX; i++) {
            int n = selfNumberGenerator(i);
            if (n < MAX) {
                arr[n] = false;
            }
        }

        for (int i = 1; i < MAX; i++) {
            if (arr[i]) {
                System.out.println(i);
            }
        }
    }

    public static int selfNumberGenerator(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

}