import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        int fruits = score.length;
        int[] orderedScore = new int[fruits];
        
        for (int i = 0; i < fruits; i++) {
            orderedScore[i] = score[fruits - 1 - i];
        }
        
        for (int i = m - 1; i < fruits; i += m) {
            answer += orderedScore[i] * m;
        }
        
        return answer;
    }
}