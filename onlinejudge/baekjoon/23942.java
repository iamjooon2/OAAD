import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] matchCounts = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        if (isPossible(matchCounts, i, j, k, l, n)) {
                            System.out.println((i + "" + j + "+" + k + "" + l + "=" + (10 * i + j + 10 * k + l) / 10 + "" + (10 * i + j + 10 * k + l) % 10));;
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("impossible");
    }

    private static boolean isPossible(int[] matchCounts, int i, int j, int k, int l, int n) {
        int index1 = (10 * i + j + 10 * k + l) / 10;
        int index2 = (10 * i + j + 10 * k + l) % 10;

        if (index1 < 0 || index1 >= matchCounts.length || index2 < 0 || index2 >= matchCounts.length) {
            return false;
        }

        return (matchCounts[i] + matchCounts[j] + matchCounts[k] + matchCounts[l] +
                matchCounts[index1] + matchCounts[index2]) == n - 4;
    }

}
