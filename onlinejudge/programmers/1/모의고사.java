import java.util.*;

class Solution {
    private static final int[] FIRST = {1, 2, 3, 4, 5};
    private static final int[] SECOND = {2, 1, 2, 3, 2, 4, 2, 5};
    private static final int[] THIRD = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] score = {0,0,0};
    
    public int[] solution(int[] answers) {
        for(int i=0; i<answers.length; i++) {
            if (answers[i] == FIRST[i%5]) {
                score[0] += 1;
            } 
            if (answers[i] == SECOND[i%8]) {
                score[1] += 1;
            } 
            if (answers[i] == THIRD[i%10]) {
                score[2] += 1;
            } 
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < score.length; i += 1){
            if (max == score[i]){
                temp.add(i + 1);
            } 
        } 
        
        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i += 1){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
