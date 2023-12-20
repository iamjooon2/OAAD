import java.util.Scanner;

public class Main {

    static int N;
    static int M;
    static String[][] answer;
    static String[][] target;
    static boolean isEyfa = true;

    public static void main(String[] args) {
        initialize();

        checkAnswer();

        if (isEyfa) {
            System.out.println("Eyfa");
        } else {
            System.out.println("Not Eyfa");
        }
    }

    private static void checkAnswer() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!answer[i][j].equals(target[i][j * 2 + 1])) {
                    isEyfa = false;
                }
            }
        }
    }

    private static void initialize() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        answer = new String[N][M];
        target = new String[N][M * 2];

        for (int i = 0; i < N; i++) {
            String[] line = scan.next().split("");
            for (int j = 0; j < M; j++) {
                answer[i][j] = line[j];
            }
        }

        for (int i = 0; i < N; i++) {
            String[] line = scan.next().split("");
            for (int j = 0; j < M * 2; j++) {
                target[i][j] = line[j];
            }
        }
    }
}
