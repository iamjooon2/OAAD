public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // \\s+는 하나 이상의 공백을 의미
        
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i -= 1) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}
