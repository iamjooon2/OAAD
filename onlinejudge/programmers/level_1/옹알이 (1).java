import java.util.*;

class Solution {
    
    private static final List<String> POSSIBLE_WORDS = List.of("aya", "ye", "woo", "ma");
    
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String word : babbling) {
            for (String possible : POSSIBLE_WORDS) {
                word = word.replace(possible, "*".repeat(possible.length()));
            }
            if (word.equals("*".repeat(word.length()))) {
                answer += 1;
            }
        }
        
        return answer;
    }
    
}