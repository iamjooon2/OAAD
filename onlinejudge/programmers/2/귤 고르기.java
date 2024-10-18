import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int fruit : tangerine) {
            if (count.containsKey(fruit)) {
                count.put(fruit, count.get(fruit) + 1);
            } else {
                count.put(fruit, 1);
            }
        }
        
        List<Integer> arr = new ArrayList<>(count.values());
        Collections.sort(arr, Collections.reverseOrder());
        
        int answer = 0;
        int order = 0;
        for (int i = 0; i < arr.size(); i += 1) {
            answer += 1;
                  
            order += arr.get(i);
            if (order >= k) {
                break;
            }
        }
            
        return answer;
    }
}