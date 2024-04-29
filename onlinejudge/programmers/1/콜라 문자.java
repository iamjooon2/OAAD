class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int count = n;
        while (true) {
            if (count < a){
                break;
            }
            int changeCount = count / a * b;
            int remainderCount = count % a;
            
            answer += changeCount;
            count = changeCount + remainderCount;
        } 
        return answer;
    }
}