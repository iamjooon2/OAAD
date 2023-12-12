import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<String, Integer> result = new HashMap<>();
        
        for (int num : nums) {
            var value = String.valueOf(num);
            result.put(value, result.getOrDefault(result.get(value), 0) + 1);
        }
        
        int N = nums.length / 2;
        
        if (result.size() > N) {
            return N;
        }
        
        return result.size();
    }
}