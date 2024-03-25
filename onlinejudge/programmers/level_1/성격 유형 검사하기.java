import java.util.*;

class Solution {

    static Map<Integer, Integer> points = Map.of(
            1, 3,
            2, 2,
            3, 1,
            4, 0,
            5, 1,
            6, 2,
            7, 3
    );
    static Map<String, Integer> score = new HashMap<>();

    public String solution(String[] survey, int[] choices) {
        for (int i = 0; i < survey.length; i += 1) {
            String[] split = survey[i].split("");
            String unAgree = split[0];
            String agree = split[1];
            int point = choices[i];

            judge(point, unAgree, agree);
        }

        String answer = makeAnswer();
        return answer;
    }

    private static void judge(int choice, String unAgree, String agree) {
        if (choice == 4) {
          
        } else if (choice < 4) {
            score.put(unAgree, score.getOrDefault(unAgree, 0) + points.get(choice));
        } else {
            score.put(agree, score.getOrDefault(agree, 0) + points.get(choice));
        }
    }

    private static String makeAnswer() {
        String answer = "";
        if (score.getOrDefault("R", 0) < score.getOrDefault("T", 0)) {
            answer += "T";
        } else {
            answer += "R";
        }

        if (score.getOrDefault("C", 0) < score.getOrDefault("F", 0)) {
            answer += "F";
        } else {
            answer += "C";
        }

        if (score.getOrDefault("J", 0) < score.getOrDefault("M", 0)) {
            answer += "M";
        } else {
            answer += "J";
        }

        if (score.getOrDefault("A", 0) < score.getOrDefault("N", 0)) {
            answer += "N";
        } else {
            answer += "A";
        }
        return answer;
    }
}
