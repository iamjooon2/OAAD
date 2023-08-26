class Solution {
    public String solution(String s, String skip, int index) {
        var answer = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            for (int i = 0; i < index; i += 1) {
                if (c == 'z') {
                    c = 'a';
                } else {
                    c++;
                }
                
                if (skip.contains(String.valueOf(c))) {
                    i -= 1;
                }
            }
            answer.append(c);
        }
        return answer.toString();
    }
}