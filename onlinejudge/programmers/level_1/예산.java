import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int answer = 0;
        while (true) {
            for (int department : d) {
                sum += department;
                if (budget < sum) {
                    break;
                }
                answer += 1;
            }
            break;
        }
        return answer;
    }
}