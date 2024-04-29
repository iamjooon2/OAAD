import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i += 1) {
            if (i == 0) {
                stack.push(arr[i]);
                continue;
            }
            
            if (stack.peek() == arr[i]) {
                continue;
            } else {
                stack.push(arr[i]);
            }
            
        }
        
        int[] answer = new int[stack.size()];
        int index = 0;
        for (int element : stack) {
            answer[index] = element;
            index += 1;
        }   
        return answer;
    }
}