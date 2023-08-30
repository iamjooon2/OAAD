class Solution {
    public int solution(String s) {
        int answer = 0;

        char x = s.charAt(0);
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (count == 0) {
                answer += 1;
                x = c;
            }
            
            if (x == c) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return answer;
    }
}