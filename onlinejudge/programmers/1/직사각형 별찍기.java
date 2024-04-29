import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i += 1) {
            for (int j = 0; j < a; j += 1) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}