
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6)  {
            answer = false;
        }
        
        for (char c : s.toCharArray()) {
            if (c < 48 || c > 57) {
                answer = false;
            }
        }
        return answer;
    }
}