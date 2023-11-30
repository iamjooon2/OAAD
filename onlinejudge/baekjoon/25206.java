import java.util.Map;
import java.util.Scanner;

public class Main {

    static final Map<String, Double> SCORE = Map.of(
            "A+", 4.5,
            "A0", 4.0,
            "B+", 3.5,
            "B0", 3.0,
            "C+", 2.5,
            "C0", 2.0,
            "D+", 1.5,
            "D0", 1.0,
            "F", 0.0
    );

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double point = 0;
        for (int i = 0; i < 20; i++) {
            String line = scan.nextLine();
            String[] split = line.split(" ");
            if (split[2].equals("P")) {
                continue;
            }
            double studyPoint = Double.parseDouble(split[1]);
            sum += SCORE.get(split[2]) * studyPoint;
            point += studyPoint;
        }

        System.out.println(String.format("%.6f", sum / point));
    }
}
