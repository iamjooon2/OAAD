
public class Solution {
    public static int solution(String[] babbling) {
        int answer = 0;

        String[] origin = {"aya", "ye", "woo", "ma"};
        String[] repeat = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String bab : babbling) {
            for (String repeatBab : repeat) {
                bab = bab.replace(repeatBab, "X");
            }

            for (String originBab : origin) {
                bab = bab.replace(originBab, "?");
            }

            int sign = 0;
            for (int i = 0; i < bab.length(); i++) {
                if (!bab.subSequence(i, i + 1).equals("?")) {
                    sign = 1;
                    break;
                }
            }

            if (sign == 0) {
                answer += 1;
            }
        }
        return answer;
    }
}