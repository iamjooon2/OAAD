import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i < right + 1; i += 1) {
            int count = 0;
            for (int j = 1; j < i + 1; j += 1) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}