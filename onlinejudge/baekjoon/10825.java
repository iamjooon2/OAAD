package main.boj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BOJ_10825 {

    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        scanner.nextLine();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i += 1) {
            String[] elements = scanner.nextLine().split(" ");

            int koreanScore = Integer.valueOf(elements[1]);
            int englishScore = Integer.valueOf(elements[2]);
            int mathScore = Integer.valueOf(elements[3]);

            String name = elements[0];

            Student student = new Student(name, koreanScore, englishScore, mathScore);
            students.add(student);
        }

        students.sort(new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.koreanScore != o2.koreanScore) {
                    return o2.koreanScore - o1.koreanScore;
                } else if (o1.englishScore != o2.englishScore) {
                    return o1.englishScore - o2.englishScore;
                } else if (o1.mathScore != o2.mathScore) {
                    return o2.mathScore - o1.mathScore;
                }
                return o1.name.compareTo(o2.name);
            }
        });

        students.forEach(s ->
                System.out.println(s.getName())
        );
    }


    static class Student {

        private final String name;
        private final int koreanScore;
        private final int englishScore;
        private final int mathScore;

        private Student(String name, int koreanScore, int englishScore, int mathScore) {
            this.name = name;
            this.koreanScore = koreanScore;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }
    }
}
