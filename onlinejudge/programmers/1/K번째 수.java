import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int index = 0;
        
        for (int[] element : commands) {
            int startIndex = element[0] - 1;
            int endIndex = element[1];
            int targetIndex = element[2] - 1;
            
            int[] answer = new int[endIndex - startIndex];
            int answerIndex = 0;
            for (int i = startIndex; i < endIndex; i += 1) {
                answer[answerIndex] = array[i];
                answerIndex++;
            }
            
            Arrays.sort(answer);
            result[index] = answer[targetIndex];
            index++;
        }
        
        return result;
    }
}
