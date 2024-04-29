import java.lang.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        final int pSize = p.length();
        final int tSize = t.length();
        final long num = Long.parseLong(p);
        
        for (int i = 0; i < tSize - pSize + 1; i++) {
            long origin = Long.parseLong(t.substring(i, i + pSize));
            if (origin <= num) {
                answer++;
            }
        }
        
        return answer;
    }
}