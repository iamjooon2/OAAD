import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] switches = new int[n];

        for (int i = 0; i < n; i++) {
            switches[i] = scan.nextInt();
        }

        int students = scan.nextInt();
        for (int i = 0; i < students; i++) {
            int gender = scan.nextInt();
            int targetIndex = scan.nextInt() - 1;

            if (gender == 1) {
                switchByBoy(switches, targetIndex);
            }

            if (gender == 2) {
                switchByGirl(switches, targetIndex);
            }
        }

        printResult(switches);
    }

    private static void switchByGirl(final int[] switches, final int targetIndex) {
        switches[targetIndex] = convert(switches[targetIndex]);
        int count = 1;
        while ((targetIndex - count) >= 0 && (targetIndex + count) < switches.length) {
            if (switches[targetIndex + count] == switches[targetIndex - count]) {
                switches[targetIndex - count] = convert(switches[targetIndex - count]);
                switches[targetIndex + count] = convert(switches[targetIndex + count]);

                count += 1;
            } else {
                break;
            }
        }
    }

    private static void switchByBoy(final int[] switches, final int targetIndex) {
        for (int j = 0; j < switches.length; j++) {
            if ((j + 1) % (targetIndex + 1) == 0) {
                switches[j] = convert(switches[j]);
            }
        }
    }

    private static void printResult(final int[] switches) {
        for (int i = 1; i <= switches.length; i++) {
            System.out.print(switches[i - 1] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }

    private static int convert(final int switchStatus) {
        if (switchStatus == 0) {
            return 1;
        }
        return 0;
    }
}