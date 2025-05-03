import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        Time[] times = new Time[N];
        for (int i = 0; i < N; i += 1) {
            int start = scan.nextInt();
            int end = scan.nextInt();

            times[i] = new Time(start, end);
        }

        Arrays.sort(times);

        int endTime = times[0].end;
        int answer = 1;
        for (int i = 1; i < N; i += 1) {
            int startTime = times[i].start;
            if (startTime >= endTime) {
                endTime = times[i].end;
                answer += 1;
            }
        }

        System.out.println(answer);
    }

    static class Time implements Comparable<Time> {

        private final int start;
        private final int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time other) {
            if (this.end != other.end) {
                return this.end - other.end;
            }
            return this.start - other.start;
        }
    }
}
