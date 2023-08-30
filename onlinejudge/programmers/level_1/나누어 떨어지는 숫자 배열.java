import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int size = 0;
    
        for (int number : arr) {
            if (number % divisor == 0) {
                size += 1;
            }
        }
        
        // 나누어 떨어지는 수가 없을 시
        if (size == 0) {
            int[] none = {-1};
            return none;
        }
        
        int[] answer = new int[size];
        int index = 0;
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] % divisor == 0) {
                answer[index] = arr[i];
                index += 1;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}