class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length - 2; i += 1) {
            for (int j = i + 1; j < number.length - 1; j += 1) {
                for (int k = j + 1; k < number.length; k += 1) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}