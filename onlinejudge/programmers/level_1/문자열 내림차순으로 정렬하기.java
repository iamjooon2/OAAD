import java.util.*;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);
 
        var string = new String(charArray);
        var answer = new StringBuilder(string).reverse().toString();
        
        return answer;
    }
}