class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i += 1){
            if ( i % 2 == 0) {
                answer += "수";
            }
            else {
                answer += "박";
            }
        }
        return answer;
    }
}