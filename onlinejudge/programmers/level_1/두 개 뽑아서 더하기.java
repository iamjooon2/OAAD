import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> results = new TreeSet<>();
        for (int i = 0; i < numbers.length; i += 1) {
            for (int j = 0; j < numbers.length; j += 1) {
                if (i != j) {
                    results.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        int[] answer = new int[results.size()];
        int index = 0;
        for (Integer number : results) {
            answer[index] = number;
            index += 1;
        }
        
        return answer;
    }
}