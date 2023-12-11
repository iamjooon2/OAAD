import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> result = new HashMap<>();
        
        for (String person : participant) {
            result.put(person, result.getOrDefault(person, 0) + 1);
        }
        
        for (String person : completion) {
            result.put(person, result.getOrDefault(person, 0) + 1);
        }
        
        String answer = null;
        for (var yes : result.keySet()) {
            if (result.get(yes) % 2 == 1) {
                answer = yes;
            }
        }
        
        return answer;
    }
}
