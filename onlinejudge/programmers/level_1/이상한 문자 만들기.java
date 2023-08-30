import java.util.*;
import java.lang.*;

class Solution {
    private static final String BLANK = " ";
    private static final String NONE = "";
    
    public String solution(String s) {
        String[] sentence = s.split(BLANK, -1);
        String answer = NONE;
        
        for (String word : sentence) {
            int index = 0;
            for (String letter : word.split(NONE)) {
                if (index % 2 == 0) {
                    answer += letter.toUpperCase();
                } else {
                    answer += letter.toLowerCase();
                }
                index += 1;
            }
            answer += BLANK;
        }
        
        return answer.substring(0, answer.length() - 1);
    }
}