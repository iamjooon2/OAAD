import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank += 1;
                }
            }
            System.out.print(rank + " ");
        }

    }
}